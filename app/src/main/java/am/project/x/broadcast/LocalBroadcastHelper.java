/*
 * Copyright (C) 2018 AlexMofer
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
package am.project.x.broadcast;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;

import am.project.x.ProjectXApplication;

/**
 * 应用内广播辅助器
 * Created by Xiang Zhicheng on 2018/7/23.
 */
@SuppressWarnings("all")
public class LocalBroadcastHelper {
    private LocalBroadcastHelper() {
        //no instance
    }

    /**
     * 发送本地广播
     *
     * @param action 要发送的广播动作
     */
    public static void sendBroadcast(@NonNull String action) {
        sendBroadcast(new Intent(action));
    }

    /**
     * 发送本地广播
     *
     * @param intent Intent
     */
    public static void sendBroadcast(@NonNull Intent intent) {
        final ProjectXApplication application = ProjectXApplication.getInstance();
        if (application == null)
            return;
        final LocalBroadcastManager manager = application.getLocalBroadcastManager();
        if (manager == null)
            return;
        manager.sendBroadcast(intent);
    }

}
