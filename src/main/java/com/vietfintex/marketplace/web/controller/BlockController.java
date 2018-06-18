package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.persistence.model.Block;
import com.vietfintex.marketplace.persistence.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("blocks")
public class BlockController {
    @Autowired
    private BlockService blockService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Block> findAll() {
        return blockService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{blockId}")
    @ResponseBody
    public Block findById(@PathParam("blockId") Long blockId) {
        return blockService.findOne(blockId);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Block create(@PathParam("blockId") Long blockId) {
        return blockService.findOne(blockId);
    }
}
