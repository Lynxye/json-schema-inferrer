package com.saasquatch.jsonschemainferrer;

import javax.annotation.Nonnull;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Input for {@link AdditionalPropertiesPolicy}
 *
 * @author sli
 */
public interface AdditionalPropertiesPolicyInput {

  /**
   * @return The input JSON schema
   */
  @Nonnull
  ObjectNode getSchema();

  @Nonnull
  SpecVersion getSpecVersion();

}