<template>
  <v-container fluid>
    <v-layout column>
      <v-layout row class="top_container">
        <v-avatar color="orange" size="40">
          <img v-if="img" src="https://vuetifyjs.com/apple-touch-icon-180x180.png" alt="avatar" />
          <v-icon medium v-else>person</v-icon>
        </v-avatar>
        <v-layout column class="team_user_id_position">
          <v-layout row class="written_container">
            <v-flex align-start class="written_team_user_id">임종완</v-flex>
            <v-spacer></v-spacer>
            <v-flex class="more_menu_container">
              <img src="../assets/photo_menu.png" class="more_menu" />
            </v-flex>
          </v-layout>
          <v-flex class="written_time">7월 5일 오후 12:34</v-flex>
        </v-layout>
      </v-layout>

      <v-layout column class="content_container">
        <v-flex class="text_container">
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Laborum qui temporibus voluptate optio maiores tempore aliquam, delectus ea omnis exercitationem dolor magnam! Fuga voluptas ipsa assumenda illo amet? Enim, pariatur.
          Lorem, ipsum dolor sit amet consectetur adipisicing elit. Fugiat, a quia veritatis alias voluptas doloremque velit est tempora autem voluptates dignissimos quis veniam eaque tempore? Quos impedit ratione doloremque inventore.
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Est quibusdam nostrum sit odio accusantium ratione doloribus! Adipisci culpa nemo earum, nam sint impedit maxime debitis mollitia necessitatibus excepturi! Repellat, et!
        </v-flex>
        <img src="../assets/cute.png" class="content_img" />
      </v-layout>
    </v-layout>

    <v-divider></v-divider>
    <v-layout row class="top_container">
      <v-layout justify-start class="read_people">
        <v-chip pill text-color="#FFFFFF">
          <v-avatar left color="red" class="white--text">은또</v-avatar>
          은또
        </v-chip>
      </v-layout>
      <v-layout justify-end>
        <v-btn class="ma-2 confirm_btn" tile color="#9AD9D8">확인</v-btn>
      </v-layout>
    </v-layout>
  </v-container>
</template>


<script>
export default {
  name: "default",
  data() {
    return {};
  },
  methods: {}
};
</script>


<style scoped>

.top_container {
  margin: 0px;
}

.team_user_id_position {
  margin-left: 10px;
  vertical-align: center;
}

.written_team_user_id {
  text-align: left;
}

.written_container {
  margin-left: 0px;
  width: 100%;
}

.written_time {
  color: #a6a6a6;
  font-size: 8px;
}

.more_menu_container {
  text-align: right;
}

.more_menu {
  width: 30px;
}

.text_container {
  font-size:13px;
  line-height: 1.6;
  margin-top: 10px;
  margin-bottom: 15px;
  text-align: justify;
}

.content_img {
  width: 100%;
}

.content_container {
  margin-bottom: 10px;
}

.confirm_btn {
  color: #ffffff;
}

.read_people {
    margin-top: 5px;
    height: 40px;
}

.headline {
  font-size: 15px!important;
}
</style>