<template>
  <v-container fluid>
    <v-layout column class="board_container" v-for="i in 2" :key="i">
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
        <v-layout column class="vote_container" pa-3>
          <v-layout class="title_height">
            <v-layout column wrap>
              <v-flex xs4 class="vote_title">이번 달 모일 날짜</v-flex>
              <v-flex xs4 class="vote_date">7월 5일 오후 12:34</v-flex>
            </v-layout>
            <v-layout column>
              <v-flex xs3 sm3 font-weight-black class="vote_dday mr-2">D - 5</v-flex>
            </v-layout>
          </v-layout>

          <v-layout column>
            <v-layout class="vote_item" align-content-center>
                <v-flex>항목 1</v-flex>
                <v-icon medium class="person_icon">person</v-icon>
                <span class="vote_item_person">1</span>
            </v-layout>
            <v-layout class="vote_item" align-content-center>
                <v-flex>항목2</v-flex>
                <v-icon medium class="person_icon">person</v-icon>
                <span class="vote_item_person">1</span>
            </v-layout>
            <v-layout class="vote_item" align-content-center>
                <v-flex>항목2</v-flex>
                <v-icon medium class="person_icon">person</v-icon>
                <span class="vote_item_person">1</span>
            </v-layout>
          </v-layout>
          
          <v-btn tile class="vote_btn mt-1" color="#4D4F69">투표하기</v-btn>
        </v-layout>
      </v-layout>
      <v-layout row class="custom_divider"></v-layout>
    </v-layout> 

    <v-btn bottom right fab fixed color="#9AD9D8" @click="clickedNewVote()">
      <v-icon>add</v-icon>
    </v-btn>

  </v-container>
</template>


<script>
export default {
  name: "default",
  data() {
    return {};
  },
  methods: {
    clickedItem() {
      this.$router.push("/vote/detail")
    },
    clickedNewVote() {
      this.$router.push("/vote/new")
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

.vote_container {
  margin: 10px 0px;
  border: 1px solid #d9d9d9;
  color: #7f7f7f;
  font-size: 16px;
}

.title_height {
  max-height: 50px;
}

.vote_title {
  color: #000000;
  font-size: 17px;
}

.vote_date {
  margin-left: 2px;
  color: #7f7f7f;
  font-size: 12px;
}

.vote_dday {
  line-height: 2.1;
  color: #4d4f69;
  font-size: 20px;
  text-align: right;
}

.vote_item {
  vertical-align: middle;
  margin: 5px 0px;
  padding: 0px 10px;
  line-height: 2;
  background-color: #F3F3F3;
  color: #7f7f7f;
  height: 35px;
  max-height: 60px;
}

.person_icon {
    justify-content: flex-end;
}

.vote_item_person {
  padding: 1px 0px;
}

.vote_btn {
 background-color: #4D4F69;
 color: #FFFFFF;
 text-align: center;
}

.custom_divider 
{
  height: 1px;
  border-top: 1px solid #a6a6a6;
}
</style>