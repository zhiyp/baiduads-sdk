"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.videodata.model.second_level_data_request import SecondLevelDataRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['SecondLevelDataRequest'] = SecondLevelDataRequest
from baiduads.videodata.model.get_second_level_data_request_wrapper import GetSecondLevelDataRequestWrapper


class TestGetSecondLevelDataRequestWrapper(unittest.TestCase):
    """GetSecondLevelDataRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetSecondLevelDataRequestWrapper(self):
        """Test GetSecondLevelDataRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetSecondLevelDataRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()