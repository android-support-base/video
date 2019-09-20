- 视频处理(网络，本地，播放，剪辑，存储)库

- 

## 发布
* 最新版本

| groupId | artifactId | version |
| -------- | -------- | -------- |
| com.amlzq.android | video |  |

* 使用
```
dependencies{
    ...
    implementation 'com.amlzq.android:video:latest.integration'
}
```

## 工程结构
* ./video
> video library
```
package: com.amlzq.android.video
基于android.media.MediaPlayer一个简单的封装库，不建议在商业项目中使用
```
* ./sample
> sample application
```
package: com.amlzq.asb
appName: Video支持库
applicationId: com.amlzq.asb.video

```

### 其他优秀的库
- 播放器
- [android.media.MediaPlayer](https://developer.android.com/reference/android/media/MediaPlayer)
- [google/ExoPlayer/适用于Android的可扩展媒体播放器](https://github.com/google/ExoPlayer)
- [FFmpeg/FFmpeg/处理多媒体内容（如音频，视频，字幕和相关元数据）的库和工具的集合](https://github.com/FFmpeg/FFmpeg)

- 接口
- [bilibili/ijkplayer/基于FFmpeg n3.4的Android/iOS视频播放器，支持MediaCodec，VideoToolbox](https://github.com/Bilibili/ijkplayer)
- [lipangit/JiaoZiVideoPlayer](https://github.com/lipangit/JiaoZiVideoPlayer)
- [DKVideoPlayer](https://github.com/dueeeke/DKVideoPlayer)
- [danylovolokh/VideoPlayerManager](https://github.com/danylovolokh/VideoPlayerManager)
- [Zhaoss/VideoPlayerDemo/封装bilibili播放器,自定义边下边播和缓存功能](https://github.com/Zhaoss/VideoPlayerDemo)
- [ashLikun/JCVideoPlayer/停止维护，不推荐使用](https://github.com/ashLikun/JCVideoPlayer)
- [yixia/VitamioBundle/适用于Android的Vitamio/商业授权](https://github.com/yixia/VitamioBundle)
- [lingcimi/jjdxm_ijkplayer](https://github.com/lingcimi/jjdxm_ijkplayer)

- 缓存
- [danikula / AndroidVideoCache](https://github.com/danikula/AndroidVideoCache)

### 实践
- 3月底时间实践
- 逾期了，警告

- 第一期
- 播放线上/本地视频
- 边播边存，缓存机制
- 可切换VideoPlayer, MediaCodec/FFmpeg

- 第二期
- 编辑视频

- 第三期
