package com.waylau.netty.demo.simplechat;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端 channel
 * 
 * @author waylau.com
 * @date 2015-2-26
 */
@Slf4j
public class SimpleChatClientHandler extends  SimpleChannelInboundHandler<String> {
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {
		log.info("{}", s);
	}
}
