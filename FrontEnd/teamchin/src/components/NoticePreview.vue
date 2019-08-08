<template>
  <v-container fluid>
    <v-layout column class="board_container">
      <v-layout row class="top_container">
        <v-avatar color="teal" size="40">
          <img v-if="img" src="https://vuetifyjs.com/apple-touch-icon-180x180.png" alt="avatar" />
          <v-icon medium v-else>person</v-icon>
        </v-avatar>
        <v-layout column class="team_user_id_position">
          <v-layout row class="written_container">
            <v-flex class="written_team_user_id">임종완</v-flex>
            
            <v-flex class="more_menu_container">
              <img src="../assets/photo_menu.png" class="more_menu" />
            </v-flex>
          </v-layout>
          <v-flex class="written_time">7월 5일 오후 12:34</v-flex>
        </v-layout>
      </v-layout>

      <v-layout @click="clickedItem()">
        <v-flex
          class="content_container"
        >Lorem ipsum dolor sit amet consectetur adipisicing elit. Laborum qui temporibus voluptate optio maiores tempore aliquam, delectus ea omnis exercitationem dolor magnam! Fuga voluptas ipsa assumenda illo amet? Enim, pariatur.</v-flex>
      </v-layout>
      <v-divider></v-divider>
    </v-layout>

    <v-btn bottom right fab fixed color="#9AD9D8" @click="clickedNewNotice()">
      <v-icon>add</v-icon>
    </v-btn>
  </v-container>
</template>


<script>
export default {
  name: "default",
  data() {
    return {
    };
  },
  methods: {
      clickedItem() {
        this.$router.push("/notice/detail");
      },
      clickedNewNotice() {
        this.$router.push("/notice/new");
      }
    }
  };
</script>


<style scoped>
.top_container {
  margin: 0px;
}

.board_container {
  margin-bottom: 15px;
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

.content_container {
  font-size: 13px;
  line-height: 1.6;
  max-height: 4.8em;
  margin-top: 10px;
  margin-bottom: 15px;
  text-align: justify;

  white-space: normal;
  overflow: hidden;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-line-clamp: 3;
  -webkit-box-orient: vertical;
}
</style>