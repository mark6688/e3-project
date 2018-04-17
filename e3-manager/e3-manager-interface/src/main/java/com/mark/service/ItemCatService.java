package com.mark.service;

import com.mark.commen.EasyUITreeNode;

import java.util.List;

/**
 * Created by mk on 2018/4/17.
 */
public interface ItemCatService {

    List<EasyUITreeNode> getCatList(Long parentId);
}
