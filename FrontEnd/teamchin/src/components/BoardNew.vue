<template>
  <v-container fluid>
    <v-layout column>
        <input type="text" class="title_border" placeholder="제목" autofocus/>
      <textarea class="textarea_border" placeholder="공지 글을 남겨보세요"></textarea>
      <v-layout align-center class="picture_border">
          <v-icon medium class="ml-1 icon_size">image</v-icon>
          <input type="file" accept=".jpg, .png" class="picture_file"/>
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

.title_border {
  height: 250px;
  border: 1px solid #d9d9d9;
  padding-left: 10px;
  margin-top: 2px;
  margin-bottom: 5px;
  height: 6vh;
  border: 1px solid #d9d9d9;
  color: #7F7F7F;
  font-size: 16px;
}

.title_border:focus {
  outline: none !important;
}

.picture_border {
  margin: 5px 0px;
  height: 6vh;
  border: 1px solid #d9d9d9;
  color: #7F7F7F;
  font-size: 16px;
}


</style>