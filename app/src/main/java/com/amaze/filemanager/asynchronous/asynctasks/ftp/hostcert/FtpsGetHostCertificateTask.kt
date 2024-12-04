/*
 * Copyright (C) 2014-2022 Arpit Khurana <arpitkh96@gmail.com>, Vishal Nehra <vishalmeham2@gmail.com>,
 * Emmanuel Messulam<emmanuelbendavid@gmail.com>, Raymond Lai <airwave209gt at gmail.com> and Contributors.
 *
 * This file is part of Amaze File Manager.
 *
 * Amaze File Manager is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.amaze.filemanager.asynchronous.asynctasks.ftp.hostcert

import android.content.Context
import com.amaze.filemanager.asynchronous.asynctasks.ftp.AbstractGetHostInfoTask
import org.json.JSONObject
import java.lang.ref.WeakReference

class FtpsGetHostCertificateTask(
    private val host: String,
    private val port: Int,
    private val explicitTls: Boolean = false,
    context: Context,
    callback: (JSONObject) -> Unit,
) : AbstractGetHostInfoTask<JSONObject, FtpsGetHostCertificateTaskCallable>(host, port, callback) {
    val ctx: WeakReference<Context> = WeakReference(context)

    override fun getTask(): FtpsGetHostCertificateTaskCallable = FtpsGetHostCertificateTaskCallable(host, port, explicitTls)
}