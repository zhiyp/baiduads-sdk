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
from baiduads.reportfeed.model.get_report_state_params import GetReportStateParams
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetReportStateParams'] = GetReportStateParams
from baiduads.reportfeed.model.get_report_feed_file_url_request_wrapper import GetReportFeedFileUrlRequestWrapper


class TestGetReportFeedFileUrlRequestWrapper(unittest.TestCase):
    """GetReportFeedFileUrlRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetReportFeedFileUrlRequestWrapper(self):
        """Test GetReportFeedFileUrlRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetReportFeedFileUrlRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()