"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.custommp.model.get_custom_mp_request import GetCustomMPRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetCustomMPRequest'] = GetCustomMPRequest
from baiduads.custommp.model.get_custom_mp_request_wrapper import GetCustomMPRequestWrapper


class TestGetCustomMPRequestWrapper(unittest.TestCase):
    """GetCustomMPRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCustomMPRequestWrapper(self):
        """Test GetCustomMPRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCustomMPRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()