package defpackage;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* JADX INFO: loaded from: classes.dex */
public final class scg extends iuj {
    public final kwb k;

    public scg(kwb kwbVar) {
        this.k = kwbVar;
    }

    @Override // defpackage.iuj
    public final void p() throws SnapshotApplyConflictException {
        this.k.c();
        throw new SnapshotApplyConflictException();
    }
}
