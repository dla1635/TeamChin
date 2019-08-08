import PostPage from '@/pages/PostPage'
import BoardRoutes from './board'
import NoticeRoutes from './notice'
import VoteRoutes from './vote'

export default {
  path: '/post',
  name: 'Post',
  component: PostPage,
  children: [
    BoardRoutes, NoticeRoutes, VoteRoutes,
  ]
}
