/*
 * Copyright 2012
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.asset.sources;

import org.terasology.asset.AssetSource;
import org.terasology.asset.AssetType;
import org.terasology.asset.AssetUri;
import org.terasology.entitySystem.common.NullIterator;

import java.net.URL;

/**
 * @author Immortius
 */
public class NullSource implements AssetSource {
    private String id;

    public NullSource(String id) {
        this.id = id;
    }

    @Override
    public String getSourceId() {
        return id;
    }

    @Override
    public URL get(AssetUri uri) {
        return null;
    }

    @Override
    public Iterable<AssetUri> list() {
        return NullIterator.newInstance();
    }

    @Override
    public Iterable<AssetUri> list(AssetType type) {
        return NullIterator.newInstance();
    }
}
