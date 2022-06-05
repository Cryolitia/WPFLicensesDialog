/*
 * Copyright 2013 Philip Schiffer
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package me.singleneuron.licensesdialog.common.licenses

object BSD3ClauseLicense : License {

    override val name: String = "BSD 3-Clause License"

    override val summaryText: String = bsd3_summary

    override val fullText: String = bsd3_full

    override val version: String = ""

    override val url: String = "https://opensource.org/licenses/BSD-3-Clause"

}