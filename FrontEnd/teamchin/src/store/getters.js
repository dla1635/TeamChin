
export const Getters = {

    userInfo(state, getters) {
      console.log("asdasd")
      return state.userId
    },
    teamId(state, getters) {
      return state.teamId
    },
    teamList(state, getters) {
      return state.teamList;
    },
    teamInfo(state, getters) {
      return state.teamInfo;
    },
// =====================================
    allFollowings (state, getters) {
      return state.user_followings
    },
    todayRecommends (state, getters) {
      return state.today_rec
    },
    getFeeds (state, getters) {
      return state.feeds
    }
  }
  // export const mypageGetters = {
  //   userInfo (state, getters) {
  //     return state.mypage
  //   }
  // }
  
  export const tokenGetters = {
    tokenInfo (state, getters) {
      return state.token
    }
  }
  
  export const navGetters = {
    navInfo (state, getters) {
      return state.nav
    }
  }
  
  export const mypageInfoGetters = {
    modifyInfo (state, getters) {
      return state.mypageModi
    }
  }
  
  export const FeedCommentGetters = {
    feedCommentInfo (state, getters) {
      return state.feedComment
    }
  }
  
  export const AlarmGetters = {
    alarmInfo (state, getters) {
      return state.alarm
    }
  
  }
  
  export const FollowerGetters = {
    allFollowers (state, getters) {
      return state.user_followers
    }
  }