"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.productadskeyword.model.start_keyword_response_wrapper_body import StartKeywordResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['StartKeywordResponseWrapperBody'] = StartKeywordResponseWrapperBody
from baiduads.productadskeyword.model.update_target_url_response_wrapper import UpdateTargetUrlResponseWrapper


class TestUpdateTargetUrlResponseWrapper(unittest.TestCase):
    """UpdateTargetUrlResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateTargetUrlResponseWrapper(self):
        """Test UpdateTargetUrlResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateTargetUrlResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()