<template>
  <v-container fluid>
    <v-layout column class="vote_container">
      <input type="text" class="vote_title" placeholder="투표 제목" />
      <input v-for="i in voteItem" :key="i" type="text" class="vote_item_title" placeholder="항목 입력" />

      <v-flex class="vote_select_box" @click="clickedAddItem()">
        <v-icon class="mr-1">add</v-icon>항목 추가
      </v-flex>

      <v-flex class="vote_select_box" @click="showDatePicker=true">
        <v-icon class="mr-1">alarm</v-icon>
        <span>{{returnDate}} {{returnTime}}</span>
      </v-flex>

      <v-layout align-center class="vote_select_box">
        <v-icon class="mr-1">done_all</v-icon>
        <v-flex>복수 선택 허용</v-flex>
        <img
          src="../assets/gray_check_white.png"
          class="check_icon mr-1"
          @click="clickedMultiSelect()"
        />
      </v-layout>
    </v-layout>
    
    <v-dialog ref="dialog" v-model="showDatePicker" :return-value.sync="returnDate" persistent full-width width="290px">
      <v-date-picker v-model="date" color="#4d4f69" scrollable>
        <v-spacer></v-spacer>
        <v-btn text color="primary" @click="showDatePicker=false">Cancel</v-btn>
        <v-btn text color="primary" @click="$refs.dialog.save(date), showTimePicker=true">NEXT</v-btn>
      </v-date-picker>
    </v-dialog>

    <v-dialog
        ref="dialog2" v-model="showTimePicker" :return-value.sync="returnTime" persistent full-width width="290px">
        <v-time-picker v-if="showTimePicker" v-model="returnTime" color="#4d4f69" full-width>
          <v-spacer></v-spacer>
          <v-btn text color="primary" @click="showTimePicker=false">Cancel</v-btn>
          <v-btn text color="primary" @click="$refs.dialog2.save(returnTime)">OK</v-btn>
        </v-time-picker>
      </v-dialog>

  </v-container>
</template>


<script>

export default {
  name: "default",
  data() {
    return {
      voteItem: 3,
      multiFlag: 0,
      showDatePicker: false,
      showTimePicker: false,
      date: new Date().toISOString().substr(0, 10),
      returnDate: "마감시간 설정",
      returnTime: null,
    };
  },
  methods: {
    clickedMultiSelect() {
      var check_el = document.getElementsByClassName("check_icon")[0];
      if (this.multiFlag == 0) {
        check_el.src = "/gray_check_yellow.png";
        this.multiFlag = 1;
      } else {
        check_el.src = "/gray_check_white.png";
        this.multiFlag = 0;
      }
    },
    clickedAddItem() {
      this.voteItem = this.voteItem + 1;
    },
  }
};
</script>


<style scoped>
.container {
  padding: 10px 0px;
}

.vote_container {
  padding: 10px;
  border: 1px solid #d9d9d9;
  color: #7f7f7f;
  font-size: 16px;
}

.vote_title {
  padding: 10px;
  border-bottom: 1px solid #d9d9d9;
  font-size: 16px;
  margin-bottom: 5px;
}

.vote_title:focus {
  outline: none !important;
}

.vote_item_title {
  margin-top: 5px;
  padding: 10px;
  border: 1px solid #d9d9d9;
  font-size: 16px;
}

.vote_item_title:focus {
  outline: none !important;
}

.vote_select_box {
  margin-top: 5px;
  padding: 8px 5px;
  border: 1px solid #d9d9d9;
  font-size: 16px;
}

.check_icon {
  width: 30px;
}
</style>