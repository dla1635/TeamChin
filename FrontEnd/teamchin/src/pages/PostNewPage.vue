<template>
  <v-container fluid>
    <v-app-bar app flat absolute scroll-target="#scrolling">
      <v-icon class="back_icon ml-1" @click="goToprevious()">clear</v-icon>
      <v-layout offset-xs-1 font-weight-bold class="appbar_title">{{postTypeName}} 작성</v-layout>
      <v-layout class="appbar_complete mr-1">완료</v-layout>
    </v-app-bar>

    <v-content style="padding-top: 44px">
      <v-divider></v-divider>
      <v-sheet id="scrolling" class="overflow-y-auto" max-height="600">
        <router-view></router-view>
      </v-sheet>
    </v-content>
  </v-container>
</template>


<script>
import { mapGetters } from "vuex";

export default {
  name: "default",
  data() {
    return {};
  },
  methods: {
    goToprevious() {
      this.$router.go(-1);
    }
  },
  computed: {
    ...mapGetters({
      postTypeName: "getPostTypeName"
    })
  }
};
</script>

<style scoped>
.back_icon {
  color: #000000;
}

.appbar_title {
  justify-content: flex-end;
}

.appbar_complete {
  justify-content: flex-end;
}

.container {
  background-color: #ffffff;
}

.top_menu_container {
  margin: 10px 0px;
}

.outside_icon {
  margin: 0px 10px;
}
</style>