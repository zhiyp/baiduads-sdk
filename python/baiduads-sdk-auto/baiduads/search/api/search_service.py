"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.api_client import ApiClient, Endpoint as _Endpoint
from baiduads.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from baiduads.search.model.get_count_by_id_request_wrapper import GetCountByIdRequestWrapper
from baiduads.search.model.get_count_by_id_response_wrapper import GetCountByIdResponseWrapper
from baiduads.search.model.get_creative_id_by_search_request_wrapper import GetCreativeIdBySearchRequestWrapper
from baiduads.search.model.get_creative_id_by_search_response_wrapper import GetCreativeIdBySearchResponseWrapper
from baiduads.search.model.get_ids_by_tabs_request_wrapper import GetIdsByTabsRequestWrapper
from baiduads.search.model.get_ids_by_tabs_response_wrapper import GetIdsByTabsResponseWrapper
from baiduads.search.model.get_keyword_id_by_search_request_wrapper import GetKeywordIdBySearchRequestWrapper
from baiduads.search.model.get_keyword_id_by_search_response_wrapper import GetKeywordIdBySearchResponseWrapper
from baiduads.search.model.get_material_info_by_search_request_wrapper import GetMaterialInfoBySearchRequestWrapper
from baiduads.search.model.get_material_info_by_search_response_wrapper import GetMaterialInfoBySearchResponseWrapper
from baiduads.search.model.get_tab_request_wrapper import GetTabRequestWrapper
from baiduads.search.model.get_tab_response_wrapper import GetTabResponseWrapper


class SearchService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_count_by_id_endpoint = _Endpoint(
            settings={
                'response_type': (GetCountByIdResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SearchService/getCountById',
                'operation_id': 'get_count_by_id',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_count_by_id_request_wrapper',
                ],
                'required': [
                    'get_count_by_id_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_count_by_id_request_wrapper':
                        (GetCountByIdRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_count_by_id_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_creative_id_by_search_endpoint = _Endpoint(
            settings={
                'response_type': (GetCreativeIdBySearchResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SearchService/getCreativeIdBySearch',
                'operation_id': 'get_creative_id_by_search',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_creative_id_by_search_request_wrapper',
                ],
                'required': [
                    'get_creative_id_by_search_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_creative_id_by_search_request_wrapper':
                        (GetCreativeIdBySearchRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_creative_id_by_search_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_ids_by_tabs_endpoint = _Endpoint(
            settings={
                'response_type': (GetIdsByTabsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SearchService/getIdsByTabs',
                'operation_id': 'get_ids_by_tabs',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_ids_by_tabs_request_wrapper',
                ],
                'required': [
                    'get_ids_by_tabs_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_ids_by_tabs_request_wrapper':
                        (GetIdsByTabsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_ids_by_tabs_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_keyword_id_by_search_endpoint = _Endpoint(
            settings={
                'response_type': (GetKeywordIdBySearchResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SearchService/getKeywordIdBySearch',
                'operation_id': 'get_keyword_id_by_search',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_keyword_id_by_search_request_wrapper',
                ],
                'required': [
                    'get_keyword_id_by_search_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_keyword_id_by_search_request_wrapper':
                        (GetKeywordIdBySearchRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_keyword_id_by_search_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_material_info_by_search_endpoint = _Endpoint(
            settings={
                'response_type': (GetMaterialInfoBySearchResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SearchService/getMaterialInfoBySearch',
                'operation_id': 'get_material_info_by_search',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_material_info_by_search_request_wrapper',
                ],
                'required': [
                    'get_material_info_by_search_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_material_info_by_search_request_wrapper':
                        (GetMaterialInfoBySearchRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_material_info_by_search_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_tab_endpoint = _Endpoint(
            settings={
                'response_type': (GetTabResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SearchService/getTab',
                'operation_id': 'get_tab',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_tab_request_wrapper',
                ],
                'required': [
                    'get_tab_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_tab_request_wrapper':
                        (GetTabRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_tab_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )

    def get_count_by_id(
        self,
        get_count_by_id_request_wrapper,
        **kwargs
    ):
        """get_count_by_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_count_by_id(get_count_by_id_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_count_by_id_request_wrapper (GetCountByIdRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetCountByIdResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_count_by_id_request_wrapper'] = \
            get_count_by_id_request_wrapper
        return self.get_count_by_id_endpoint.call_with_http_info(**kwargs)

    def get_creative_id_by_search(
        self,
        get_creative_id_by_search_request_wrapper,
        **kwargs
    ):
        """get_creative_id_by_search  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_creative_id_by_search(get_creative_id_by_search_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_creative_id_by_search_request_wrapper (GetCreativeIdBySearchRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetCreativeIdBySearchResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_creative_id_by_search_request_wrapper'] = \
            get_creative_id_by_search_request_wrapper
        return self.get_creative_id_by_search_endpoint.call_with_http_info(**kwargs)

    def get_ids_by_tabs(
        self,
        get_ids_by_tabs_request_wrapper,
        **kwargs
    ):
        """get_ids_by_tabs  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_ids_by_tabs(get_ids_by_tabs_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_ids_by_tabs_request_wrapper (GetIdsByTabsRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetIdsByTabsResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_ids_by_tabs_request_wrapper'] = \
            get_ids_by_tabs_request_wrapper
        return self.get_ids_by_tabs_endpoint.call_with_http_info(**kwargs)

    def get_keyword_id_by_search(
        self,
        get_keyword_id_by_search_request_wrapper,
        **kwargs
    ):
        """get_keyword_id_by_search  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_keyword_id_by_search(get_keyword_id_by_search_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_keyword_id_by_search_request_wrapper (GetKeywordIdBySearchRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetKeywordIdBySearchResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_keyword_id_by_search_request_wrapper'] = \
            get_keyword_id_by_search_request_wrapper
        return self.get_keyword_id_by_search_endpoint.call_with_http_info(**kwargs)

    def get_material_info_by_search(
        self,
        get_material_info_by_search_request_wrapper,
        **kwargs
    ):
        """get_material_info_by_search  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_material_info_by_search(get_material_info_by_search_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_material_info_by_search_request_wrapper (GetMaterialInfoBySearchRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetMaterialInfoBySearchResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_material_info_by_search_request_wrapper'] = \
            get_material_info_by_search_request_wrapper
        return self.get_material_info_by_search_endpoint.call_with_http_info(**kwargs)

    def get_tab(
        self,
        get_tab_request_wrapper,
        **kwargs
    ):
        """get_tab  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_tab(get_tab_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_tab_request_wrapper (GetTabRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetTabResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_tab_request_wrapper'] = \
            get_tab_request_wrapper
        return self.get_tab_endpoint.call_with_http_info(**kwargs)
