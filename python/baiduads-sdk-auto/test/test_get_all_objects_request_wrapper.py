"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.bulkjob.model.get_all_objects_query import GetAllObjectsQuery
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetAllObjectsQuery'] = GetAllObjectsQuery
from baiduads.bulkjob.model.get_all_objects_request_wrapper import GetAllObjectsRequestWrapper


class TestGetAllObjectsRequestWrapper(unittest.TestCase):
    """GetAllObjectsRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetAllObjectsRequestWrapper(self):
        """Test GetAllObjectsRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetAllObjectsRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()