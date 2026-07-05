package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.experience.ExperienceContent;
import com.anthropic.claude.sessions.types.CodeAgent;
import java.util.ArrayList;
import java.util.List;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d7 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ d7(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.zy7
    public final Object a() {
        o67 o67Var;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        Experience experienceB;
        int i2 = this.E;
        int i3 = 0;
        iei ieiVar = iei.a;
        Object obj = this.F;
        switch (i2) {
            case 0:
                WebView webView = (WebView) obj;
                if (webView != null) {
                    webView.goBack();
                }
                return ieiVar;
            case 1:
                return (s6j) ((m8j) obj).b.getValue();
            case 2:
                return Boolean.valueOf(((hi) ((ai) obj).c.getValue()).b());
            case 3:
                wd6.t0((l50) obj);
                return ieiVar;
            case 4:
                return ((beh) obj).d0();
            case 5:
                ((wm0) obj).i.getValue();
                return ieiVar;
            case 6:
                dx9 dx9VarG = ((lx9) obj).g();
                int i4 = dx9VarG.p;
                ex9 ex9Var = (ex9) w44.V0(dx9VarG.m);
                return Boolean.valueOf((ex9Var != null ? ex9Var.a : 0) + 1 > i4 - 4);
            case 7:
                ((gr0) obj).O();
                return ieiVar;
            case 8:
                p61 p61Var = (p61) obj;
                return Boolean.valueOf(((Boolean) p61Var.G.getValue()).booleanValue() || ((Boolean) p61Var.E.a.getValue()).booleanValue() || ((Boolean) ((lsc) p61Var.F.h).getValue()).booleanValue());
            case 9:
                return ((gj1) ((ki1) obj).e.F).a();
            case 10:
                ((k5j) obj).E();
                return ieiVar;
            case 11:
                return Float.valueOf(((Number) ((a80) obj).e()).floatValue());
            case 12:
                ((pz7) obj).invoke(Boolean.FALSE, null);
                return ieiVar;
            case 13:
                return ((gj1) obj).a();
            case 14:
                yq1 yq1Var = (yq1) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                qjc qjcVar = yq1Var.b;
                tq1 tq1Var = new tq1(((jy8) yq1Var.d).G0(), i3);
                RealBufferedSource realBufferedSource = new RealBufferedSource(tq1Var);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new RealBufferedSource$inputStream$1(realBufferedSource.peek()), null, options);
                Exception exc = tq1Var.G;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = z67.a;
                String str = options.outMimeType;
                ((y67) yq1Var.e).getClass();
                if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
                    v67 v67Var = new v67(new w67(new RealBufferedSource$inputStream$1(realBufferedSource.peek()), 0));
                    int iC = v67Var.c();
                    o67Var = new o67(iC == 2 || iC == 7 || iC == 4 || iC == 5, v67Var.l());
                } else {
                    o67Var = o67.c;
                }
                int i5 = o67Var.b;
                boolean z2 = o67Var.a;
                Exception exc2 = tq1Var.G;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                efe efeVar = nx8.c;
                ColorSpace colorSpace = (ColorSpace) dch.z(qjcVar, efeVar);
                Context context = qjcVar.a;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) dch.z(qjcVar, efeVar);
                }
                options.inPremultiplied = ((Boolean) dch.z(qjcVar, nx8.d)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) dch.z(qjcVar, nx8.b);
                if ((z2 || i5 > 0) && (config == null || ne5.g(config))) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) dch.z(qjcVar, nx8.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && x44.r(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i6 = options.outWidth;
                try {
                    if (i6 <= 0 || (i = options.outHeight) <= 0) {
                        options.inSampleSize = 1;
                        z = false;
                        options.inScaled = false;
                    } else {
                        int i7 = (i5 == 90 || i5 == 270) ? i : i6;
                        if (i5 != 90 && i5 != 270) {
                            i6 = i;
                        }
                        j8g j8gVar = qjcVar.b;
                        k6f k6fVar = qjcVar.c;
                        efe efeVar2 = mx8.b;
                        long j = c0l.j(i7, i6, j8gVar, k6fVar, (j8g) dch.z(qjcVar, efeVar2));
                        int i8 = (int) (j >> 32);
                        int i9 = i7;
                        int i10 = (int) (j & 4294967295L);
                        int iHighestOneBit = Integer.highestOneBit(i9 / i8);
                        int iHighestOneBit2 = Integer.highestOneBit(i6 / i10);
                        int iOrdinal = k6fVar.ordinal();
                        if (iOrdinal == 0) {
                            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        } else {
                            if (iOrdinal != 1) {
                                wg6.i();
                                return null;
                            }
                            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                        }
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        double d = iMin;
                        double d2 = ((double) i9) / d;
                        double d3 = ((double) i6) / d;
                        j8g j8gVar2 = (j8g) dch.z(qjcVar, efeVar2);
                        double d4 = ((double) i8) / d2;
                        double d5 = ((double) i10) / d3;
                        int iOrdinal2 = k6fVar.ordinal();
                        if (iOrdinal2 == 0) {
                            dMax = Math.max(d4, d5);
                        } else {
                            if (iOrdinal2 != 1) {
                                wg6.i();
                                return null;
                            }
                            dMax = Math.min(d4, d5);
                        }
                        v46 v46Var = j8gVar2.a;
                        if (v46Var instanceof q46) {
                            double d6 = ((double) ((q46) v46Var).a) / d2;
                            if (dMax > d6) {
                                dMax = d6;
                            }
                        }
                        v46 v46Var2 = j8gVar2.b;
                        if (v46Var2 instanceof q46) {
                            double d7 = ((double) ((q46) v46Var2).a) / d3;
                            if (dMax > d7) {
                                dMax = d7;
                            }
                        }
                        if (qjcVar.d == tad.F && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z3 = dMax == 1.0d;
                        options.inScaled = !z3;
                        if (!z3) {
                            if (dMax > 1.0d) {
                                options.inDensity = mwa.K(2.147483647E9d / dMax);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = mwa.K(2.147483647E9d * dMax);
                            }
                        }
                        z = false;
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new RealBufferedSource$inputStream$1(realBufferedSource), null, options);
                    realBufferedSource.close();
                    Exception exc3 = tq1Var.G;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        sz6.j("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z2 || i5 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i5 > 0) {
                            matrix.postRotate(i5, width, height);
                        }
                        RectF rectF = new RectF(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != MTTypesetterKt.kLineSkipLimitMultiplier || rectF.top != MTTypesetterKt.kLineSkipLimitMultiplier) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i5 == 90 || i5 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, z67.a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    return new ko5(quk.e(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        wd6.Z(realBufferedSource, th);
                        throw th2;
                    }
                }
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((eed) obj).b.setValue(Boolean.valueOf(!((Boolean) r0.b.getValue()).booleanValue()));
                return ieiVar;
            case 16:
                ((o82) obj).h.setValue(Boolean.TRUE);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                isc iscVar = (isc) obj;
                iscVar.i(iscVar.h() + 1);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ljg ljgVar = (ljg) obj;
                if (ljgVar != null) {
                    try {
                        ljgVar.close();
                        break;
                    } catch (Throwable unused) {
                    }
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((ik1) obj).a();
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((z9e) obj).E = true;
                return ieiVar;
            case 21:
                ((f4j) obj).a.setValue(null);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((xc3) obj).a();
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return (r7i) ((b33) obj).a();
            case 24:
                List list = (List) ((lsc) ((h80) obj).F).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((CodeAgent) obj2).is_virtual()) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((ps7) obj).b(false);
                return ieiVar;
            case 26:
                oz3 oz3Var = (oz3) obj;
                boolean z4 = oz3Var.c;
                x97 x97Var = oz3Var.a;
                if (!z4 || !x97Var.d() || ((Boolean) oz3Var.d.getValue()).booleanValue() || (experienceB = x97Var.b(x97Var.l)) == null) {
                    return null;
                }
                ExperienceContent content = experienceB.getContent();
                BannerContent bannerContent = content instanceof BannerContent ? (BannerContent) content : null;
                if (bannerContent == null) {
                    return null;
                }
                return new vsf(experienceB.getId(), bannerContent);
            case 27:
                rrk.i((hp4) obj);
                return ieiVar;
            case 28:
                return ((nyj) obj).r(":memory:");
            default:
                v84 v84Var = (v84) obj;
                if (!v84Var.Z()) {
                    v84Var.c0(null);
                }
                return ieiVar;
        }
    }
}
