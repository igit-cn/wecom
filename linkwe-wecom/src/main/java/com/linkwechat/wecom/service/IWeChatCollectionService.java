package com.linkwechat.wecom.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linkwechat.wecom.domain.WeChatCollection;

/**
 * 聊天工具 侧边栏栏 素材收藏
 *
 * @author kwen
 */
public interface IWeChatCollectionService extends IService<WeChatCollection> {

    /**
     * 添加收藏
     *
     * @param materialId 素材id
     * @param userId 用户id
     * @return 结果
     */
    public int addCollection( Long materialId, Long userId);

    /**
     * 取消收藏
     *
     * @param materialId 素材id
     * @param userId 用户id
     * @return 结果
     */
    public int cancleCollection( Long materialId, Long userId);

}
