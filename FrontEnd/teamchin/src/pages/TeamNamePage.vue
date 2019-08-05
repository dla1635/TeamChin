<template>
  <v-container id="container">
    <v-layout column style="padding:30px;">
        <v-layout column class="main_text">
            <v-flex>당신의</v-flex>
            <v-flex>그룹을</v-flex>
            <v-flex>만들어 보세요</v-flex>
        </v-layout>
        <v-flex id="text_field_container" xs12 sm6>
            <div id="outline">
                <v-text-field v-model = "teamName" outline id="input" placeholder="그룹 이름을 적어주세요" :rules="['그룹 이름은 필수 입니다.']" autofocus clearable></v-text-field>
            </div>
        </v-flex>
        <v-btn @click="confirm" color= "#9AD9D8"  id="confirm">다음</v-btn>
        
    </v-layout>
  </v-container>   
</template>


<script>
export default {
  name: "Team",
  data() {
    return {
        teamName : ""

    };
  },
  methods: {
      confirm() {
          if(this.teamName !== "") {
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
