// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dlp.proto

package com.google.cloud.pso.bq_pii_classifier.entities.dlp;

public interface TableDataProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.google.cloud.pso.bq_pii_classifier.entities.dlp.TableDataProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the profile.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the profile.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The resource name of the table.
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * </pre>
   *
   * <code>string full_resource = 3;</code>
   * @return The fullResource.
   */
  java.lang.String getFullResource();
  /**
   * <pre>
   * The resource name of the table.
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * </pre>
   *
   * <code>string full_resource = 3;</code>
   * @return The bytes for fullResource.
   */
  com.google.protobuf.ByteString
      getFullResourceBytes();
}