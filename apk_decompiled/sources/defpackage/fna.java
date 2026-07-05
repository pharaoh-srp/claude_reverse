package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fna {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static tna a(c cVar, String str, boolean z) {
        bna bnaVarA;
        try {
            if (str == null) {
                bnaVarA = null;
            } else {
                try {
                    bnaVarA = cna.b.a(str);
                } catch (Exception e) {
                    tna tnaVar = new tna(e);
                    if (z) {
                        zpi.b(cVar);
                    }
                    return tnaVar;
                }
            }
            if (bnaVarA != null) {
                tna tnaVar2 = new tna(bnaVarA);
                if (z) {
                    zpi.b(cVar);
                }
                return tnaVar2;
            }
            bna bnaVarA2 = gna.a(cVar);
            if (str != null) {
                cna.b.a.d(str, bnaVarA2);
            }
            tna tnaVar3 = new tna(bnaVarA2);
            if (z) {
                zpi.b(cVar);
            }
            return tnaVar3;
        } catch (Throwable th) {
            if (z) {
                zpi.b(cVar);
            }
            throw th;
        }
    }

    public static tna b(Context context, ZipInputStream zipInputStream, String str) {
        bna bnaVarA;
        rna rnaVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            bnaVarA = null;
        } else {
            try {
                bnaVarA = cna.b.a(str);
            } catch (IOException e) {
                return new tna(e);
            }
        }
        if (bnaVarA != null) {
            return new tna(bnaVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        bna bnaVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                RealBufferedSource realBufferedSource = new RealBufferedSource(Okio.g(zipInputStream));
                String[] strArr = a.I;
                bnaVar = a(new c(realBufferedSource), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new tna(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    oga.b("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    oga.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (bnaVar == null) {
            return new tna(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) bnaVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rnaVar = null;
                    break;
                }
                rnaVar = (rna) it.next();
                if (rnaVar.d.equals(str4)) {
                    break;
                }
            }
            if (rnaVar != null) {
                rnaVar.f = zpi.d((Bitmap) entry.getValue(), rnaVar.a, rnaVar.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (tt7 tt7Var : bnaVar.f.values()) {
                if (tt7Var.a.equals(entry2.getKey())) {
                    tt7Var.c = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                oga.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) bnaVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                rna rnaVar2 = (rna) ((Map.Entry) it2.next()).getValue();
                if (rnaVar2 == null) {
                    return null;
                }
                String str5 = rnaVar2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            rnaVar2.f = zpi.d(bitmapDecodeByteArray, rnaVar2.a, rnaVar2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        oga.b("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            cna.b.a.d(str, bnaVar);
        }
        return new tna(bnaVar);
    }

    public static Boolean c(RealBufferedSource realBufferedSource, byte[] bArr) {
        try {
            RealBufferedSource realBufferedSourcePeek = realBufferedSource.peek();
            for (byte b2 : bArr) {
                if (realBufferedSourcePeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            realBufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            oga.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void d() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        mr9.o();
    }
}
