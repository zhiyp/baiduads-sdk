"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from pvsearchfunction.api.pv_search_function import PvSearchFunction  # noqa: E501


class TestPvSearchFunction(unittest.TestCase):
    """PvSearchFunction unit test stubs"""

    def setUp(self):
        self.api = PvSearchFunction()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_pv_search(self):
        """Test case for get_pv_search

        """
        pass


if __name__ == '__main__':
    unittest.main()