"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.keyword.model.delete_word_response_wrapper_body import DeleteWordResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['DeleteWordResponseWrapperBody'] = DeleteWordResponseWrapperBody
from baiduads.keyword.model.delete_word_response_wrapper import DeleteWordResponseWrapper


class TestDeleteWordResponseWrapper(unittest.TestCase):
    """DeleteWordResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteWordResponseWrapper(self):
        """Test DeleteWordResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteWordResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()