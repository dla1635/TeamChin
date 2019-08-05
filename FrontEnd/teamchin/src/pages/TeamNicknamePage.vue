<template>
  <v-container id="container">
    <v-layout column style="padding:30px;">
        <v-layout column class="main_text">
            <v-flex>그룹내에서</v-flex>
            <v-flex>닉네임을</v-flex>
            <v-flex>정해주세요</v-flex>
        </v-layout>
        <v-flex id="text_field_container" xs12 sm6>
            <div id="outline">
                <v-text-field outline v-model="teamNickname" placeholder="닉네임을 적어주세요" id="input" autofocus clearable></v-text-field>
            </div>
        </v-flex>
        <v-btn  color= "#9AD9D8" @click="createTeam" id="confirm">확인</v-btn>
    </v-layout>
  </v-container>
</template>


<script>

import {Action} from '@/store/actions'

export default {
  name: "Team",
  data() {
    return {
        teamNickname: '',
        teamName :''
    };
  },
  mounted() {
      this.teamName = this.$route.query.teamName
  },
  methods: {
      createTeam () {
          if(this.teamName !== "") {

            var payload = {
                name: this.teamName,
                nickname: this.teamNickname
            }
            
            this.$store.dispatch('createTeam', payload);

            this.$router.push({ path: 'teamNickname', query: { teamName: this.teamName }})
          }
      }
  }
};
</script>

<style scoped>

#container {
 background-color: #4D4F69;
 height: 635px;
}
.main_text {
    color: white;
    text-align: left;
    font-weight: 900;
    font-size: 35px;
    margin-top: 120px;
}
#text_field_container {
 margin-top: 30px;
 color: #E4E0D7;
}

#outline {
    height: 50px;
    border: 2px solid white;
    border-radius: 7px;
}

#confirm {
    width: 25px;
    height:45px;
    font-size: 17px;
    border-radius: 7px;
    color: white;
    margin: 0 auto;
    margin-top: 10px;
}
</style>
