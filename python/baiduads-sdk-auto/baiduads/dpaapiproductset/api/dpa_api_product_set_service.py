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
from baiduads.dpaapiproductset.model.add_product_set_request_wrapper import AddProductSetRequestWrapper
from baiduads.dpaapiproductset.model.add_product_set_response_wrapper import AddProductSetResponseWrapper
from baiduads.dpaapiproductset.model.delete_product_set_request_wrapper import DeleteProductSetRequestWrapper
from baiduads.dpaapiproductset.model.delete_product_set_response_wrapper import DeleteProductSetResponseWrapper
from baiduads.dpaapiproductset.model.get_catalog_fields_info_request_wrapper import GetCatalogFieldsInfoRequestWrapper
from baiduads.dpaapiproductset.model.get_catalog_fields_info_response_wrapper import GetCatalogFieldsInfoResponseWrapper
from baiduads.dpaapiproductset.model.get_catalog_material_fields_info_request_wrapper import GetCatalogMaterialFieldsInfoRequestWrapper
from baiduads.dpaapiproductset.model.get_catalog_material_fields_info_response_wrapper import GetCatalogMaterialFieldsInfoResponseWrapper
from baiduads.dpaapiproductset.model.get_product_set_by_catalog_request_wrapper import GetProductSetByCatalogRequestWrapper
from baiduads.dpaapiproductset.model.get_product_set_by_catalog_response_wrapper import GetProductSetByCatalogResponseWrapper
from baiduads.dpaapiproductset.model.get_product_set_request_wrapper import GetProductSetRequestWrapper
from baiduads.dpaapiproductset.model.get_product_set_response_wrapper import GetProductSetResponseWrapper
from baiduads.dpaapiproductset.model.update_product_set_request_wrapper import UpdateProductSetRequestWrapper
from baiduads.dpaapiproductset.model.update_product_set_response_wrapper import UpdateProductSetResponseWrapper


class DpaApiProductSetService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_product_set_endpoint = _Endpoint(
            settings={
                'response_type': (AddProductSetResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DpaApiProductSetService/addProductSet',
                'operation_id': 'add_product_set',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_product_set_request_wrapper',
                ],
                'required': [
                    'add_product_set_request_wrapper',
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
                    'add_product_set_request_wrapper':
                        (AddProductSetRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_product_set_request_wrapper': 'body',
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
        self.delete_product_set_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteProductSetResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DpaApiProductSetService/deleteProductSet',
                'operation_id': 'delete_product_set',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_product_set_request_wrapper',
                ],
                'required': [
                    'delete_product_set_request_wrapper',
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
                    'delete_product_set_request_wrapper':
                        (DeleteProductSetRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_product_set_request_wrapper': 'body',
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
        self.get_catalog_fields_info_endpoint = _Endpoint(
            settings={
                'response_type': (GetCatalogFieldsInfoResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DpaApiProductSetService/getCatalogFieldsInfo',
                'operation_id': 'get_catalog_fields_info',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_catalog_fields_info_request_wrapper',
                ],
                'required': [
                    'get_catalog_fields_info_request_wrapper',
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
                    'get_catalog_fields_info_request_wrapper':
                        (GetCatalogFieldsInfoRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_catalog_fields_info_request_wrapper': 'body',
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
        self.get_catalog_material_fields_info_endpoint = _Endpoint(
            settings={
                'response_type': (GetCatalogMaterialFieldsInfoResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DpaApiProductSetService/getCatalogMaterialFieldsInfo',
                'operation_id': 'get_catalog_material_fields_info',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_catalog_material_fields_info_request_wrapper',
                ],
                'required': [
                    'get_catalog_material_fields_info_request_wrapper',
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
                    'get_catalog_material_fields_info_request_wrapper':
                        (GetCatalogMaterialFieldsInfoRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_catalog_material_fields_info_request_wrapper': 'body',
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
        self.get_product_set_endpoint = _Endpoint(
            settings={
                'response_type': (GetProductSetResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DpaApiProductSetService/getProductSet',
                'operation_id': 'get_product_set',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_product_set_request_wrapper',
                ],
                'required': [
                    'get_product_set_request_wrapper',
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
                    'get_product_set_request_wrapper':
                        (GetProductSetRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_product_set_request_wrapper': 'body',
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
        self.get_product_set_by_catalog_endpoint = _Endpoint(
            settings={
                'response_type': (GetProductSetByCatalogResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DpaApiProductSetService/getProductSetByCatalog',
                'operation_id': 'get_product_set_by_catalog',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_product_set_by_catalog_request_wrapper',
                ],
                'required': [
                    'get_product_set_by_catalog_request_wrapper',
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
                    'get_product_set_by_catalog_request_wrapper':
                        (GetProductSetByCatalogRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_product_set_by_catalog_request_wrapper': 'body',
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
        self.update_product_set_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateProductSetResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/DpaApiProductSetService/updateProductSet',
                'operation_id': 'update_product_set',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_product_set_request_wrapper',
                ],
                'required': [
                    'update_product_set_request_wrapper',
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
                    'update_product_set_request_wrapper':
                        (UpdateProductSetRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_product_set_request_wrapper': 'body',
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

    def add_product_set(
        self,
        add_product_set_request_wrapper,
        **kwargs
    ):
        """add_product_set  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_product_set(add_product_set_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_product_set_request_wrapper (AddProductSetRequestWrapper):

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
            AddProductSetResponseWrapper
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
        kwargs['add_product_set_request_wrapper'] = \
            add_product_set_request_wrapper
        return self.add_product_set_endpoint.call_with_http_info(**kwargs)

    def delete_product_set(
        self,
        delete_product_set_request_wrapper,
        **kwargs
    ):
        """delete_product_set  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_product_set(delete_product_set_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_product_set_request_wrapper (DeleteProductSetRequestWrapper):

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
            DeleteProductSetResponseWrapper
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
        kwargs['delete_product_set_request_wrapper'] = \
            delete_product_set_request_wrapper
        return self.delete_product_set_endpoint.call_with_http_info(**kwargs)

    def get_catalog_fields_info(
        self,
        get_catalog_fields_info_request_wrapper,
        **kwargs
    ):
        """get_catalog_fields_info  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_catalog_fields_info(get_catalog_fields_info_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_catalog_fields_info_request_wrapper (GetCatalogFieldsInfoRequestWrapper):

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
            GetCatalogFieldsInfoResponseWrapper
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
        kwargs['get_catalog_fields_info_request_wrapper'] = \
            get_catalog_fields_info_request_wrapper
        return self.get_catalog_fields_info_endpoint.call_with_http_info(**kwargs)

    def get_catalog_material_fields_info(
        self,
        get_catalog_material_fields_info_request_wrapper,
        **kwargs
    ):
        """get_catalog_material_fields_info  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_catalog_material_fields_info(get_catalog_material_fields_info_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_catalog_material_fields_info_request_wrapper (GetCatalogMaterialFieldsInfoRequestWrapper):

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
            GetCatalogMaterialFieldsInfoResponseWrapper
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
        kwargs['get_catalog_material_fields_info_request_wrapper'] = \
            get_catalog_material_fields_info_request_wrapper
        return self.get_catalog_material_fields_info_endpoint.call_with_http_info(**kwargs)

    def get_product_set(
        self,
        get_product_set_request_wrapper,
        **kwargs
    ):
        """get_product_set  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_product_set(get_product_set_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_product_set_request_wrapper (GetProductSetRequestWrapper):

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
            GetProductSetResponseWrapper
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
        kwargs['get_product_set_request_wrapper'] = \
            get_product_set_request_wrapper
        return self.get_product_set_endpoint.call_with_http_info(**kwargs)

    def get_product_set_by_catalog(
        self,
        get_product_set_by_catalog_request_wrapper,
        **kwargs
    ):
        """get_product_set_by_catalog  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_product_set_by_catalog(get_product_set_by_catalog_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_product_set_by_catalog_request_wrapper (GetProductSetByCatalogRequestWrapper):

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
            GetProductSetByCatalogResponseWrapper
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
        kwargs['get_product_set_by_catalog_request_wrapper'] = \
            get_product_set_by_catalog_request_wrapper
        return self.get_product_set_by_catalog_endpoint.call_with_http_info(**kwargs)

    def update_product_set(
        self,
        update_product_set_request_wrapper,
        **kwargs
    ):
        """update_product_set  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_product_set(update_product_set_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_product_set_request_wrapper (UpdateProductSetRequestWrapper):

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
            UpdateProductSetResponseWrapper
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
        kwargs['update_product_set_request_wrapper'] = \
            update_product_set_request_wrapper
        return self.update_product_set_endpoint.call_with_http_info(**kwargs)
