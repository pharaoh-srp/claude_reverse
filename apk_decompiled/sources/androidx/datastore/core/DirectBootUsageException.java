package androidx.datastore.core;

import defpackage.mdj;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/DirectBootUsageException;", "Ljava/io/IOException;", "Landroidx/datastore/core/IOException;", "datastore-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class DirectBootUsageException extends IOException {
    public final String E;

    public DirectBootUsageException(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.E = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.E;
    }
}
