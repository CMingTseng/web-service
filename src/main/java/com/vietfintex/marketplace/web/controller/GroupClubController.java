package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.GroupClubDTO;
import com.vietfintex.marketplace.web.dto.GroupClubWrapDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.GroupClubService;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.Log4jEntityResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/groupClub")
public class GroupClubController {
    private static final Logger logger = Logger.getLogger(GroupClubController.class);
    @Autowired
    private GroupClubService groupClubService;

    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO insertOrUpdate(@RequestBody final GroupClubWrapDTO groupClubWrapDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            GroupClubDTO groupClubDTOReturn = groupClubService.createOrInsertClub(groupClubWrapDTO.getUserLoginId(),
                    groupClubWrapDTO.getGroupClubDTO());
            if(groupClubDTOReturn != null){
                response.setObjectReturn(groupClubDTOReturn);
                response.setSuccess(true);
                return response;
            }
        }catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "/getGroupClubList", method = RequestMethod.POST)
    @ResponseBody
    public  ResponseDTO getGroupClubList(@RequestBody final GroupClubDTO groupClubDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            List<GroupClubDTO> returnObject = groupClubService.getListGroupClub(groupClubDTO.getGroupId()
            ,groupClubDTO.getPrivacy(),groupClubDTO.getGroupName(),groupClubDTO.getOwnerId());
            if(returnObject != null){
                response.setObjectReturn(returnObject);
                response.setSuccess(true);
                return response;
            }
        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra: "+e.getMessage());
        }
        return response;
    }

}
