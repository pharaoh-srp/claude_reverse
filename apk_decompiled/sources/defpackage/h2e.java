package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h2e extends wd1 {
    public final Context I;
    public ug5 J;
    public AssetFileDescriptor K;
    public FileInputStream L;
    public long M;
    public boolean N;

    public h2e(Context context) {
        super(false);
        this.I = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) throws RawResourceDataSource$RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.J = ug5Var;
        q();
        Uri uri = ug5Var.a;
        long j = ug5Var.f;
        long j2 = ug5Var.e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.I;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(ij0.C(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.K = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.K.getFileDescriptor());
            this.L = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.K.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.M = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.M = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.M = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.M;
                    this.M = j4 == -1 ? j : Math.min(j4, j);
                }
                this.N = true;
                r(ug5Var);
                return j != -1 ? j : this.M;
            } catch (RawResourceDataSource$RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e4, 2005);
        }
    }

    @Override // defpackage.tg5
    public final void close() {
        this.J = null;
        try {
            try {
                FileInputStream fileInputStream = this.L;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.L = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.K;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.K = null;
                    if (this.N) {
                        this.N = false;
                        n();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.L = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.K;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.K = null;
                    if (this.N) {
                        this.N = false;
                        n();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.K = null;
                if (this.N) {
                    this.N = false;
                    n();
                }
            }
        }
    }

    @Override // defpackage.tg5
    public final Uri m() {
        ug5 ug5Var = this.J;
        if (ug5Var != null) {
            return ug5Var.a;
        }
        return null;
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSource$RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.M;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.L;
            String str = tpi.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            long j2 = this.M;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.M = j2 - ((long) i3);
                }
                j(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
