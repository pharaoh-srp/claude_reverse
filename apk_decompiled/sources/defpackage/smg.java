package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class smg implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ yq1 a;
    public final /* synthetic */ z9e b;

    public smg(yq1 yq1Var, z9e z9eVar) {
        this.a = yq1Var;
        this.b = z9eVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        yq1 yq1Var = this.a;
        qjc qjcVar = yq1Var.b;
        j8g j8gVar = qjcVar.b;
        k6f k6fVar = qjcVar.c;
        efe efeVar = mx8.b;
        long j = c0l.j(width, height, j8gVar, k6fVar, (j8g) dch.z(qjcVar, efeVar));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            qjc qjcVar2 = yq1Var.b;
            double dK = c0l.k(width, height, i, i2, qjcVar2.c, (j8g) dch.z(qjcVar2, efeVar));
            boolean z = dK < 1.0d;
            this.b.E = z;
            if (z || yq1Var.b.d == tad.E) {
                imageDecoder.setTargetSize(mwa.K(((double) width) * dK), mwa.K(dK * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new pmg());
        qjc qjcVar3 = yq1Var.b;
        imageDecoder.setAllocator(ne5.g(nx8.f(qjcVar3)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) dch.z(qjcVar3, nx8.g)).booleanValue() ? 1 : 0);
        efe efeVar2 = nx8.c;
        if (((ColorSpace) dch.z(qjcVar3, efeVar2)) != null) {
            imageDecoder.setTargetColorSpace((ColorSpace) dch.z(qjcVar3, efeVar2));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) dch.z(qjcVar3, nx8.d)).booleanValue());
    }
}
