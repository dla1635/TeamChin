export const Getters = {
  getPostTypeName(state, getters) {
    return state.postTypeName
  }
//     allFollowings(state, getters) {
//     return state.user_followings
//   },
//   todayRecommends(state, getters) {
//     return state.today_rec
//   },
//   getFeeds(state, getters) {
//     return state.feeds
//   }
// }
// export const mypageGetters = {
//   userInfo(state, getters) {
//     return state.mypage
}

export const tokenGetters = {
  tokenInfo(state, getters) {
    return state.token
  }
}

export const navGetters = {
  navInfo(state, getters) {
    return state.nav
  }
}

export const mypageInfoGetters = {
  modifyInfo(state, getters) {
    return state.mypageModi
  }
}

export const FeedCommentGetters = {
  feedCommentInfo(state, getters) {
    return state.feedComment
  }
}

export const AlarmGetters = {
  alarmInfo(state, getters) {
    return state.alarm
  }

}

export const FollowerGetters = {
  allFollowers(state, getters) {
    return state.user_followers
  }
}