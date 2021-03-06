package net.qiujuer.library.planck.internal;

import android.support.annotation.NonNull;

import net.qiujuer.library.planck.PlanckSource;
import net.qiujuer.library.planck.internal.section.CacheDataPartial;

import java.io.File;

/**
 * This partial to used cache file or local file
 *
 * @author qiujuer Email: qiujuer@live.cn
 * @version 1.0.0
 * Create at: 2018/8/8
 */
class LocalPlanckSource extends CacheDataPartial implements PlanckSource {
    LocalPlanckSource(@NonNull File file) {
        super(file);
    }
}
