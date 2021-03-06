/*
 * Copyright 2010 JBoss Inc
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

package org.kie.internal.task.api.model;

import java.io.Externalizable;
import java.util.Date;

public interface Attachment extends Externalizable {
    
    Long getId();

    void setId(long id);

    String getName();

    void setName(String name);

    AccessType getAccessType();

    void setAccessType(AccessType accessType);

    String getContentType();

    void setContentType(String contentType);

    Date getAttachedAt();

    void setAttachedAt(Date attachedAt);

    User getAttachedBy();

    void setAttachedBy(User attachedBy);   
    
    int getSize();

    void setContent(Content content);

    void setSize(int size);
        
    long getAttachmentContentId();

    void setAttachmentContentId(long contentId);

}
