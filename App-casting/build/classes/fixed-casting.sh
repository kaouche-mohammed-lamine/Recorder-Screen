#!/bin/sh
# by : lamine93.zidan@gmail.com
# under GPL
# https://www.youtube.com/channel/UCbSYQlh3J_sbLon76WxZYww
ffmpeg -f alsa -ac 1 -i default -f x11grab -r 15 -s $1x$2 -i :0.0 -acodec pcm_s16le -vcodec libx264 -preset ultrafast -threads 0 $3
