"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.adgroup.model.delete_adgroup_response_wrapper_body import DeleteAdgroupResponseWrapperBody
from baiduads.common.model.api_response_header import ApiResponseHeader
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['DeleteAdgroupResponseWrapperBody'] = DeleteAdgroupResponseWrapperBody
from baiduads.adgroup.model.add_adgroup_response_wrapper import AddAdgroupResponseWrapper


class TestAddAdgroupResponseWrapper(unittest.TestCase):
    """AddAdgroupResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddAdgroupResponseWrapper(self):
        """Test AddAdgroupResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddAdgroupResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()