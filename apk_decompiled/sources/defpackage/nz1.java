package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nz1 extends lja {
    @Override // defpackage.lja
    public final List i(Executor executor) {
        return Arrays.asList(new z84(), new eq5(executor));
    }

    @Override // defpackage.lja
    public final List j() {
        return Collections.singletonList(new mz1(1));
    }
}
