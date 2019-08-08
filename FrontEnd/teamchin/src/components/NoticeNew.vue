<template>
  <v-container fluid>
    <v-layout column>
      <textarea class="textarea_border" placeholder="공지 글을 남겨보세요" autofocus></textarea>
      <v-layout align-center class="alarm_border">
          <v-icon medium class="ml-1 icon_size">notifications</v-icon>
          <v-flex class="ml-1">팀원 알람 허용</v-flex>
          <img src="../assets/gray_check_white.png" class="check_icon mr-1" @click="clickedAlarm()">
      </v-layout>
      <v-layout align-center class="picture_border">
          <v-icon medium class="ml-1 icon_size">image</v-icon>
          <v-flex class="ml-1">사진 추가</v-flex>
      </v-layout>
    </v-layout>
  </v-container>
</template>


<script>
export default {
  name: "default",
  data() {
    return {
      alarmFlag: 0,
    };
  },
  methods: {
    clickedAlarm() {
      var check_el = document.getElementsByClassName("check_icon")[0]
      if(this.alarmFlag == 0) {
        check_el.src = "/gray_check_yellow.png"
        this.alarmFlag = 1;
      } else {
        check_el.src = "/gray_check_white.png"
        this.alarmFlag = 0;
      }
    },
  }
};
</script>


<style scoped>
.container {
  padding: 10px 0px;
}

.textarea_border {
  height: 250px;
  border: 1px solid #d9d9d9;
  padding-left: 10px;
}

.textarea_border:focus {
  outline: none !important;
}

.alarm_border {
  margin-top: 5px;
  height: 6vh;
  border: 1px solid #d9d9d9;
  color: #7F7F7F;
  font-size: 16px;
}

.icon_size {
  font-size: 28px;
}

.check_icon {
  width: 30px;
}

.picture_border {
  margin: 5px 0px;
  height: 6vh;
  border: 1px solid #d9d9d9;
  color: #7F7F7F;
  font-size: 16px;
}
</style>