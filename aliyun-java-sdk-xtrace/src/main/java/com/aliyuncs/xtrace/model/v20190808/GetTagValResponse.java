/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.xtrace.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xtrace.transform.v20190808.GetTagValResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTagValResponse extends AcsResponse {

	private String requestId;

	private List<String> tagValues;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getTagValues() {
		return this.tagValues;
	}

	public void setTagValues(List<String> tagValues) {
		this.tagValues = tagValues;
	}

	@Override
	public GetTagValResponse getInstance(UnmarshallerContext context) {
		return	GetTagValResponseUnmarshaller.unmarshall(this, context);
	}
}
