/*
 * SonarQube, open source software quality management tool.
 * Copyright (C) 2008-2014 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.batch.protocol.input;

public class Rule {
  private final String key;
  private final String repo;
  private final String internalKey;
  private final String name;

  public Rule(String ruleKey, String repositoryKey, String internalKey, String name) {
    this.key = ruleKey;
    this.repo = repositoryKey;
    this.internalKey = internalKey;
    this.name = name;
  }

  public String ruleKey() {
    return key;
  }
  
  public String repositoryKey() {
    return repo;
  }
  
  public String internalKey() {
    return internalKey;
  }

  public String name() {
    return name;
  }

}
