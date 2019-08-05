<template>
  <v-container fluid>
    <v-layout column>
      <v-flex offset-xs-2 offset-sm-2 class="main_title">BOARD</v-flex>

      <v-flex xs12 sm12 md12 lg12>
        <v-tabs fixed-tabs>
          <v-tabs-slider color="#4D4F69" class="slider_position"></v-tabs-slider>
          <v-tab>공지</v-tab>
          <v-tab>자유글</v-tab>
          <v-tab>투표</v-tab>
          <v-tab>클라우드</v-tab>
        </v-tabs>
      </v-flex>
      <v-divider class="mx-12 tab_border"></v-divider>
    </v-layout>

    <v-btn absolute bottom right fab color="#9AD9D8">
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
  methods: {}
};
</script>


<style scoped>
.main_title {
  font-size: 20pt;
  font-weight: 900;
  text-align: left;
}
.v-tabs__slider {
  height: 5px;
}

.slider_position {
  position: relative;
  z-index: 2;
}

.tab_border {
  position: relative;
  top: -2px;
  z-index: 1;
}

</style>