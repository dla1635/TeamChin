<template>
  <v-container fluid>
    <v-app-bar app flat absolute scroll-target="#scrolling-1">
      <v-flex offset-xs-2 font-weight-black class="main_title">BOARD</v-flex>
      <template v-slot:extension>
        <v-tabs fixed-tabs color="#4D4F69" background-color="transparent" class="tab_border">
        <v-tabs-slider color="#4D4F69" class="slider_position"></v-tabs-slider>
        <v-tab
          v-for="i in 4"
          :key="i"
          :to="tabs[i-1].link"
          @click="clickedTab(tabs[i-1].tab)"
        >{{ tabs[i-1].tab }}</v-tab>
      </v-tabs>
      </template>
    </v-app-bar>

    <v-content style="padding-top: 93px">
      <v-sheet id="scrolling-1" class="overflow-y-auto" max-height="600">
        <router-view></router-view>
      </v-sheet>
    </v-content>

    <!-- <v-btn bottom right fab fixed color="#9AD9D8">
      <v-icon>add</v-icon>
    </v-btn>-->
  </v-container>
</template>


<script>
export default {
  name: "default",
  data() {
    return {
      tabs: [
        { tab: "공지", link: "/notice" },
        { tab: "자유글", link: "/board" },
        { tab: "투표", link: "/vote" },
        { tab: "클라우드", link: "" }
      ]
    };
  },
  methods: {
    clickedBoardTitle() {
      this.$router.push("/notice");
    },
    clickedTab(postTypeName) {
      this.$store.state.postTypeName = postTypeName;
    }
  }
};
</script>


<style scoped>
.v-application--is-ltr
  .v-tabs-bar.v-tabs-bar--is-mobile:not(.v-tabs-bar--show-arrows)
  > .v-slide-group__wrapper
  > .v-tabs-bar__content
  > .v-tabs-slider-wrapper
  + .v-tab {
  margin-left: 0px;
}

.tab_border {
  border-bottom: 1px solid #a6a6a6;
}

.v-tab--active {
  font-weight: bold;
}

.main_title {
  font-family: "Noto Sans KR", sans-serif;
  color: #4d4f69;
  font-size: 20pt;
  text-align: left;
}

.v-tabs-slider-wrapper {
  height: 5px !important;
}

.slider_position {
  position: relative;
  z-index: 2;
}

</style>