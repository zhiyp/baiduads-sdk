"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.rtafeed.model.rta_strategy_type import RtaStrategyType
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['RtaStrategyType'] = RtaStrategyType
from baiduads.rtafeed.model.update_strategy_request_wrapper import UpdateStrategyRequestWrapper


class TestUpdateStrategyRequestWrapper(unittest.TestCase):
    """UpdateStrategyRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateStrategyRequestWrapper(self):
        """Test UpdateStrategyRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateStrategyRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()