/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.accumulo.manager.tableOps.tableImport;

import java.io.Serializable;
import java.util.List;

import org.apache.accumulo.core.data.NamespaceId;
import org.apache.accumulo.core.data.TableId;

class ImportedTableInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  public String user;
  public String tableName;
  public TableId tableId;
  public NamespaceId namespaceId;
  public List<DirectoryMapping> directories;
  public String exportFile;

  static class DirectoryMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    public DirectoryMapping(String exportDir) {
      this.exportDir = exportDir;
    }

    public final String exportDir;
    public String importDir;
  }
}
