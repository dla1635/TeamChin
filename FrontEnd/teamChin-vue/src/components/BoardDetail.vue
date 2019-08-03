<template>
  <v-container fluid>
    <v-layout column>
      <v-layout row>
        <v-avatar color="orange" size="45">
          <img v-if="img" src="https://vuetifyjs.com/apple-touch-icon-180x180.png" alt="avatar" />
          <span v-else class="white--text headline">EY</span>
        </v-avatar>
        <v-layout column align-start align-content-center class="team_user_id_position">
          <v-layout row class="written_container">
            <v-flex align-start class="written_team_user_id">임종완</v-flex>
            <v-flex class="more_menu_container">
              <img src="../assets/photo_menu.png" class="more_menu" />
            </v-flex>
          </v-layout>
          <v-flex class="written_time">7월 5일 오후 12:34</v-flex>
        </v-layout>
      </v-layout>

      <v-layout column class="content_container">
        <v-flex
          class="text_container"
        >Lorem ipsum dolor sit amet consectetur adipisicing elit. Laborum qui temporibus voluptate optio maiores tempore aliquam, delectus ea omnis exercitationem dolor magnam! Fuga voluptas ipsa assumenda illo amet? Enim, pariatur.</v-flex>
        <img src="../assets/cute.png" class="content_img" />
      </v-layout>
    </v-layout>

    <v-divider></v-divider>
    <v-layout justify-end>
      <v-btn class="ma-2 confirm_btn" tile color="#9AD9D8">확인</v-btn>
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
.team_user_id_position {
  margin-left: 10px;
  vertical-align: center;
  margin-top: 5px;
}

.written_team_user_id {
  font-weight: normal;
  text-align: left;
}

.written_container {
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
  width: 15%;
}

.text_container {
  line-height: 1.6;
  margin: 15px 10px;
  text-align: justify;
}

.content_img {
  width: 100%;
}

.content_container {
  margin-bottom: 10px;
}

.confirm_btn {
  color: #FFFFFF;
}
</style>