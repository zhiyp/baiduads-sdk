"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.creativefeed.model.recommend_reason import RecommendReason
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['RecommendReason'] = RecommendReason
from baiduads.creativefeed.model.bind_recommend_reasons_request_wrapper import BindRecommendReasonsRequestWrapper


class TestBindRecommendReasonsRequestWrapper(unittest.TestCase):
    """BindRecommendReasonsRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testBindRecommendReasonsRequestWrapper(self):
        """Test BindRecommendReasonsRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = BindRecommendReasonsRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()