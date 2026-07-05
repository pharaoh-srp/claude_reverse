package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class v67 {
    public static final byte[] A;
    public static final byte[] B;
    public static final String[] C;
    public static final int[] D;
    public static final byte[] E;
    public static final s67 F;
    public static final s67[][] G;
    public static final s67[] H;
    public static final HashMap[] I;
    public static final HashMap[] J;
    public static final Set K;
    public static final HashMap L;
    public static final Charset M;
    public static final byte[] N;
    public static final byte[] O;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final int[] n;
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public r67 l;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        n = new int[]{8, 8, 8};
        o = new int[]{8};
        p = new byte[]{-1, -40, -1};
        q = new byte[]{102, 116, 121, 112};
        r = new byte[]{109, 105, 102, 49};
        s = new byte[]{104, 101, 105, 99};
        t = new byte[]{97, 118, 105, 102};
        u = new byte[]{97, 118, 105, 115};
        v = new byte[]{79, 76, 89, 77, 80, 0};
        w = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        x = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        z = new byte[]{82, 73, 70, 70};
        A = new byte[]{87, 69, 66, 80};
        B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        s67[] s67VarArr = {new s67("NewSubfileType", 254, 4), new s67("SubfileType", 255, 4), new s67("ImageWidth", FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, 3, 4), new s67("ImageLength", 257, 3, 4), new s67("BitsPerSample", 258, 3), new s67("Compression", 259, 3), new s67("PhotometricInterpretation", 262, 3), new s67("ImageDescription", 270, 2), new s67("Make", 271, 2), new s67("Model", 272, 2), new s67("StripOffsets", 273, 3, 4), new s67("Orientation", 274, 3), new s67("SamplesPerPixel", 277, 3), new s67("RowsPerStrip", 278, 3, 4), new s67("StripByteCounts", 279, 3, 4), new s67("XResolution", 282, 5), new s67("YResolution", 283, 5), new s67("PlanarConfiguration", 284, 3), new s67("ResolutionUnit", 296, 3), new s67("TransferFunction", 301, 3), new s67("Software", 305, 2), new s67("DateTime", 306, 2), new s67("Artist", 315, 2), new s67("WhitePoint", 318, 5), new s67("PrimaryChromaticities", 319, 5), new s67("SubIFDPointer", 330, 4), new s67("JPEGInterchangeFormat", 513, 4), new s67("JPEGInterchangeFormatLength", 514, 4), new s67("YCbCrCoefficients", 529, 5), new s67("YCbCrSubSampling", 530, 3), new s67("YCbCrPositioning", 531, 3), new s67("ReferenceBlackWhite", 532, 5), new s67("Copyright", 33432, 2), new s67("ExifIFDPointer", 34665, 4), new s67("GPSInfoIFDPointer", 34853, 4), new s67("SensorTopBorder", 4, 4), new s67("SensorLeftBorder", 5, 4), new s67("SensorBottomBorder", 6, 4), new s67("SensorRightBorder", 7, 4), new s67("ISO", 23, 3), new s67("JpgFromRaw", 46, 7), new s67("Xmp", 700, 1)};
        s67[] s67VarArr2 = {new s67("ExposureTime", 33434, 5), new s67("FNumber", 33437, 5), new s67("ExposureProgram", 34850, 3), new s67("SpectralSensitivity", 34852, 2), new s67("PhotographicSensitivity", 34855, 3), new s67("OECF", 34856, 7), new s67("SensitivityType", 34864, 3), new s67("StandardOutputSensitivity", 34865, 4), new s67("RecommendedExposureIndex", 34866, 4), new s67("ISOSpeed", 34867, 4), new s67("ISOSpeedLatitudeyyy", 34868, 4), new s67("ISOSpeedLatitudezzz", 34869, 4), new s67("ExifVersion", 36864, 2), new s67("DateTimeOriginal", 36867, 2), new s67("DateTimeDigitized", 36868, 2), new s67("OffsetTime", 36880, 2), new s67("OffsetTimeOriginal", 36881, 2), new s67("OffsetTimeDigitized", 36882, 2), new s67("ComponentsConfiguration", 37121, 7), new s67("CompressedBitsPerPixel", 37122, 5), new s67("ShutterSpeedValue", 37377, 10), new s67("ApertureValue", 37378, 5), new s67("BrightnessValue", 37379, 10), new s67("ExposureBiasValue", 37380, 10), new s67("MaxApertureValue", 37381, 5), new s67("SubjectDistance", 37382, 5), new s67("MeteringMode", 37383, 3), new s67("LightSource", 37384, 3), new s67("Flash", 37385, 3), new s67("FocalLength", 37386, 5), new s67("SubjectArea", 37396, 3), new s67("MakerNote", 37500, 7), new s67("UserComment", 37510, 7), new s67("SubSecTime", 37520, 2), new s67("SubSecTimeOriginal", 37521, 2), new s67("SubSecTimeDigitized", 37522, 2), new s67("FlashpixVersion", 40960, 7), new s67("ColorSpace", 40961, 3), new s67("PixelXDimension", 40962, 3, 4), new s67("PixelYDimension", 40963, 3, 4), new s67("RelatedSoundFile", 40964, 2), new s67("InteroperabilityIFDPointer", 40965, 4), new s67("FlashEnergy", 41483, 5), new s67("SpatialFrequencyResponse", 41484, 7), new s67("FocalPlaneXResolution", 41486, 5), new s67("FocalPlaneYResolution", 41487, 5), new s67("FocalPlaneResolutionUnit", 41488, 3), new s67("SubjectLocation", 41492, 3), new s67("ExposureIndex", 41493, 5), new s67("SensingMethod", 41495, 3), new s67("FileSource", 41728, 7), new s67("SceneType", 41729, 7), new s67("CFAPattern", 41730, 7), new s67("CustomRendered", 41985, 3), new s67("ExposureMode", 41986, 3), new s67("WhiteBalance", 41987, 3), new s67("DigitalZoomRatio", 41988, 5), new s67("FocalLengthIn35mmFilm", 41989, 3), new s67("SceneCaptureType", 41990, 3), new s67("GainControl", 41991, 3), new s67("Contrast", 41992, 3), new s67("Saturation", 41993, 3), new s67("Sharpness", 41994, 3), new s67("DeviceSettingDescription", 41995, 7), new s67("SubjectDistanceRange", 41996, 3), new s67("ImageUniqueID", 42016, 2), new s67("CameraOwnerName", 42032, 2), new s67("BodySerialNumber", 42033, 2), new s67("LensSpecification", 42034, 5), new s67("LensMake", 42035, 2), new s67("LensModel", 42036, 2), new s67("Gamma", 42240, 5), new s67("DNGVersion", 50706, 1), new s67("DefaultCropSize", 50720, 3, 4)};
        s67[] s67VarArr3 = {new s67("GPSVersionID", 0, 1), new s67("GPSLatitudeRef", 1, 2), new s67("GPSLatitude", 2, 5, 10), new s67("GPSLongitudeRef", 3, 2), new s67("GPSLongitude", 4, 5, 10), new s67("GPSAltitudeRef", 5, 1), new s67("GPSAltitude", 6, 5), new s67("GPSTimeStamp", 7, 5), new s67("GPSSatellites", 8, 2), new s67("GPSStatus", 9, 2), new s67("GPSMeasureMode", 10, 2), new s67("GPSDOP", 11, 5), new s67("GPSSpeedRef", 12, 2), new s67("GPSSpeed", 13, 5), new s67("GPSTrackRef", 14, 2), new s67("GPSTrack", 15, 5), new s67("GPSImgDirectionRef", 16, 2), new s67("GPSImgDirection", 17, 5), new s67("GPSMapDatum", 18, 2), new s67("GPSDestLatitudeRef", 19, 2), new s67("GPSDestLatitude", 20, 5), new s67("GPSDestLongitudeRef", 21, 2), new s67("GPSDestLongitude", 22, 5), new s67("GPSDestBearingRef", 23, 2), new s67("GPSDestBearing", 24, 5), new s67("GPSDestDistanceRef", 25, 2), new s67("GPSDestDistance", 26, 5), new s67("GPSProcessingMethod", 27, 7), new s67("GPSAreaInformation", 28, 7), new s67("GPSDateStamp", 29, 2), new s67("GPSDifferential", 30, 3), new s67("GPSHPositioningError", 31, 5)};
        s67[] s67VarArr4 = {new s67("InteroperabilityIndex", 1, 2)};
        s67[] s67VarArr5 = {new s67("NewSubfileType", 254, 4), new s67("SubfileType", 255, 4), new s67("ThumbnailImageWidth", FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, 3, 4), new s67("ThumbnailImageLength", 257, 3, 4), new s67("BitsPerSample", 258, 3), new s67("Compression", 259, 3), new s67("PhotometricInterpretation", 262, 3), new s67("ImageDescription", 270, 2), new s67("Make", 271, 2), new s67("Model", 272, 2), new s67("StripOffsets", 273, 3, 4), new s67("ThumbnailOrientation", 274, 3), new s67("SamplesPerPixel", 277, 3), new s67("RowsPerStrip", 278, 3, 4), new s67("StripByteCounts", 279, 3, 4), new s67("XResolution", 282, 5), new s67("YResolution", 283, 5), new s67("PlanarConfiguration", 284, 3), new s67("ResolutionUnit", 296, 3), new s67("TransferFunction", 301, 3), new s67("Software", 305, 2), new s67("DateTime", 306, 2), new s67("Artist", 315, 2), new s67("WhitePoint", 318, 5), new s67("PrimaryChromaticities", 319, 5), new s67("SubIFDPointer", 330, 4), new s67("JPEGInterchangeFormat", 513, 4), new s67("JPEGInterchangeFormatLength", 514, 4), new s67("YCbCrCoefficients", 529, 5), new s67("YCbCrSubSampling", 530, 3), new s67("YCbCrPositioning", 531, 3), new s67("ReferenceBlackWhite", 532, 5), new s67("Copyright", 33432, 2), new s67("ExifIFDPointer", 34665, 4), new s67("GPSInfoIFDPointer", 34853, 4), new s67("DNGVersion", 50706, 1), new s67("DefaultCropSize", 50720, 3, 4)};
        F = new s67("StripOffsets", 273, 3);
        G = new s67[][]{s67VarArr, s67VarArr2, s67VarArr3, s67VarArr4, s67VarArr5, s67VarArr, new s67[]{new s67("ThumbnailImage", FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, 7), new s67("CameraSettingsIFDPointer", 8224, 4), new s67("ImageProcessingIFDPointer", 8256, 4)}, new s67[]{new s67("PreviewImageStart", 257, 4), new s67("PreviewImageLength", 258, 4)}, new s67[]{new s67("AspectFrame", 4371, 3)}, new s67[]{new s67("ColorSpace", 55, 3)}};
        H = new s67[]{new s67("SubIFDPointer", 330, 4), new s67("ExifIFDPointer", 34665, 4), new s67("GPSInfoIFDPointer", 34853, 4), new s67("InteroperabilityIFDPointer", 40965, 4), new s67("CameraSettingsIFDPointer", 8224, 1), new s67("ImageProcessingIFDPointer", 8256, 1)};
        I = new HashMap[10];
        J = new HashMap[10];
        K = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        L = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        M = charsetForName;
        N = "Exif\u0000\u0000".getBytes(charsetForName);
        O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            s67[][] s67VarArr6 = G;
            if (i >= s67VarArr6.length) {
                HashMap map = L;
                s67[] s67VarArr7 = H;
                map.put(Integer.valueOf(s67VarArr7[0].a), 5);
                map.put(Integer.valueOf(s67VarArr7[1].a), 1);
                map.put(Integer.valueOf(s67VarArr7[2].a), 2);
                map.put(Integer.valueOf(s67VarArr7[3].a), 3);
                map.put(Integer.valueOf(s67VarArr7[4].a), 7);
                map.put(Integer.valueOf(s67VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            I[i] = new HashMap();
            J[i] = new HashMap();
            for (s67 s67Var : s67VarArr6[i]) {
                I[i].put(Integer.valueOf(s67Var.a), s67Var);
                J[i].put(s67Var.b, s67Var);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:12:0x0046, B:14:0x0049, B:21:0x005e, B:27:0x007b, B:34:0x008e, B:40:0x00a1, B:37:0x0096, B:38:0x009a, B:39:0x009e, B:41:0x00ab, B:43:0x00b4, B:45:0x00ba, B:47:0x00c0, B:49:0x00c6, B:54:0x00d4), top: B:67:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v67(java.io.InputStream r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v67.<init>(java.io.InputStream):void");
    }

    public static ByteOrder s(q67 q67Var) throws IOException {
        short s2 = q67Var.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        e0.e("Invalid byte order: ", Integer.toHexString(s2));
        return null;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(M);
            map.put("DateTime", new r67(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", r67.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", r67.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", r67.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", r67.a(0L, this.f));
        }
    }

    public final String b(String str) {
        r67 r67VarD = d(str);
        if (r67VarD != null) {
            int i = r67VarD.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                t67[] t67VarArr = (t67[]) r67VarD.g(this.f);
                if (t67VarArr == null || t67VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(t67VarArr));
                    return null;
                }
                t67 t67Var = t67VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (t67Var.a / t67Var.b));
                t67 t67Var2 = t67VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (t67Var2.a / t67Var2.b));
                t67 t67Var3 = t67VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (t67Var3.a / t67Var3.b)));
            }
            boolean zContains = K.contains(str);
            ByteOrder byteOrder = this.f;
            if (!zContains) {
                return r67VarD.f(byteOrder);
            }
            try {
                return Double.toString(r67VarD.d(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        r67 r67VarD = d("Orientation");
        if (r67VarD == null) {
            return 1;
        }
        try {
            return r67VarD.e(this.f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final r67 d(String str) {
        r67 r67Var;
        int i;
        r67 r67Var2;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.c) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (r67Var2 = this.l) != null)) {
            return r67Var2;
        }
        for (int i2 = 0; i2 < G.length; i2++) {
            r67 r67Var3 = (r67) this.d[i2].get(str);
            if (r67Var3 != null) {
                return r67Var3;
            }
        }
        if (!"Xmp".equals(str) || (r67Var = this.l) == null) {
            return null;
        }
        return r67Var;
    }

    public final void e(u67 u67Var, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            pmf.n("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i2 < 31) {
            pmf.n("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new p67(u67Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", r67.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", r67.c(Integer.parseInt(strExtractMetadata3), this.f));
                }
                if (strExtractMetadata2 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata2);
                    mapArr[0].put("Orientation", r67.c(i3 != 90 ? i3 != 180 ? i3 != 270 ? 1 : 8 : 3 : 6, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata4);
                    int i5 = Integer.parseInt(strExtractMetadata5);
                    if (i5 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    u67Var.d(i4);
                    byte[] bArr = new byte[6];
                    u67Var.readFully(bArr);
                    int i6 = i4 + 6;
                    int i7 = i5 - 6;
                    if (!Arrays.equals(bArr, N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    u67Var.readFully(bArr2);
                    this.h = i6;
                    t(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i8 = Integer.parseInt(strExtractMetadata8);
                    int i9 = Integer.parseInt(strExtractMetadata9);
                    long j = i8;
                    u67Var.d(j);
                    byte[] bArr3 = new byte[i9];
                    u67Var.readFully(bArr3);
                    this.l = new r67(j, bArr3, 1, i9);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0067. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118 A[LOOP:0: B:10:0x0024->B:56:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.q67 r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v67.f(q67, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5 A[PHI: r5 r20
      0x00d5: PHI (r5v5 q67) = (r5v6 q67), (r5v14 q67), (r5v14 q67) binds: [B:68:0x00ea, B:61:0x00db, B:58:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r20v2 int) = (r20v4 int), (r20v7 int), (r20v8 int) binds: [B:68:0x00ea, B:61:0x00db, B:58:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.io.BufferedInputStream r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v67.g(java.io.BufferedInputStream):int");
    }

    public final void h(u67 u67Var) throws Throwable {
        int i;
        int i2;
        k(u67Var);
        HashMap[] mapArr = this.d;
        r67 r67Var = (r67) mapArr[1].get("MakerNote");
        if (r67Var != null) {
            u67 u67Var2 = new u67(r67Var.d);
            u67Var2.G = this.f;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            u67Var2.readFully(bArr2);
            u67Var2.d(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            u67Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                u67Var2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                u67Var2.d(12L);
            }
            u(u67Var2, 6);
            r67 r67Var2 = (r67) mapArr[7].get("PreviewImageStart");
            r67 r67Var3 = (r67) mapArr[7].get("PreviewImageLength");
            if (r67Var2 != null && r67Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", r67Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", r67Var3);
            }
            r67 r67Var4 = (r67) mapArr[8].get("AspectFrame");
            if (r67Var4 != null) {
                int[] iArr = (int[]) r67Var4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                r67 r67VarC = r67.c(i5, this.f);
                r67 r67VarC2 = r67.c(i6, this.f);
                mapArr[0].put("ImageWidth", r67VarC);
                mapArr[0].put("ImageLength", r67VarC2);
            }
        }
    }

    public final void i(q67 q67Var) throws Throwable {
        if (m) {
            Objects.toString(q67Var);
        }
        q67Var.G = ByteOrder.BIG_ENDIAN;
        int i = q67Var.F;
        q67Var.c(x.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = q67Var.readInt();
                int i3 = q67Var.readInt();
                int i4 = q67Var.F;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.h = i6;
                    byte[] bArr = new byte[i2];
                    q67Var.readFully(bArr);
                    int i7 = q67Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    t(bArr, 0);
                    z();
                    w(new q67(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = y;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        q67Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = q67Var.F - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            q67Var.readFully(bArr4);
                            this.l = new r67(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                q67Var.c(i5 - q67Var.F);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void j(q67 q67Var) throws Throwable {
        if (m) {
            Objects.toString(q67Var);
        }
        q67Var.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        q67Var.readFully(bArr);
        q67Var.readFully(bArr2);
        q67Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        q67Var.c(i - q67Var.F);
        q67Var.readFully(bArr4);
        f(new q67(bArr4), i, 5);
        q67Var.c(i3 - q67Var.F);
        q67Var.G = ByteOrder.BIG_ENDIAN;
        int i4 = q67Var.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = q67Var.readUnsignedShort();
            int unsignedShort2 = q67Var.readUnsignedShort();
            if (unsignedShort == F.a) {
                short s2 = q67Var.readShort();
                short s3 = q67Var.readShort();
                r67 r67VarC = r67.c(s2, this.f);
                r67 r67VarC2 = r67.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", r67VarC);
                mapArr[0].put("ImageWidth", r67VarC2);
                return;
            }
            q67Var.c(unsignedShort2);
        }
    }

    public final void k(u67 u67Var) throws Throwable {
        q(u67Var);
        u(u67Var, 0);
        y(u67Var, 0);
        y(u67Var, 5);
        y(u67Var, 4);
        z();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            r67 r67Var = (r67) mapArr[1].get("MakerNote");
            if (r67Var != null) {
                u67 u67Var2 = new u67(r67Var.d);
                u67Var2.G = this.f;
                u67Var2.c(6);
                u(u67Var2, 9);
                r67 r67Var2 = (r67) mapArr[9].get("ColorSpace");
                if (r67Var2 != null) {
                    mapArr[1].put("ColorSpace", r67Var2);
                }
            }
        }
    }

    public final int l() {
        switch (c()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void m(u67 u67Var) throws Throwable {
        if (m) {
            Objects.toString(u67Var);
        }
        k(u67Var);
        HashMap[] mapArr = this.d;
        r67 r67Var = (r67) mapArr[0].get("JpgFromRaw");
        if (r67Var != null) {
            f(new q67(r67Var.d), (int) r67Var.c, 5);
        }
        r67 r67Var2 = (r67) mapArr[0].get("ISO");
        r67 r67Var3 = (r67) mapArr[1].get("PhotographicSensitivity");
        if (r67Var2 == null || r67Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", r67Var2);
    }

    public final void n(q67 q67Var) throws Throwable {
        if (m) {
            Objects.toString(q67Var);
        }
        q67Var.G = ByteOrder.LITTLE_ENDIAN;
        q67Var.c(z.length);
        int i = q67Var.readInt() + 8;
        byte[] bArr = A;
        q67Var.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                q67Var.readFully(bArr2);
                int i2 = q67Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(B, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    q67Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = N;
                    if (ljk.i(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.h = i3;
                    t(bArrCopyOfRange, 0);
                    w(new q67(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                q67Var.c(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void o(q67 q67Var, HashMap map) throws Throwable {
        r67 r67Var = (r67) map.get("JPEGInterchangeFormat");
        r67 r67Var2 = (r67) map.get("JPEGInterchangeFormatLength");
        if (r67Var == null || r67Var2 == null) {
            return;
        }
        int iE = r67Var.e(this.f);
        int iE2 = r67Var2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE <= 0 || iE2 <= 0 || this.b != null || this.a != null) {
            return;
        }
        q67Var.c(iE);
        q67Var.readFully(new byte[iE2]);
    }

    public final boolean p(HashMap map) {
        r67 r67Var = (r67) map.get("ImageLength");
        r67 r67Var2 = (r67) map.get("ImageWidth");
        if (r67Var == null || r67Var2 == null) {
            return false;
        }
        return r67Var.e(this.f) <= 512 && r67Var2.e(this.f) <= 512;
    }

    public final void q(u67 u67Var) throws IOException {
        ByteOrder byteOrderS = s(u67Var);
        this.f = byteOrderS;
        u67Var.G = byteOrderS;
        int unsignedShort = u67Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            e0.e("Invalid start code: ", Integer.toHexString(unsignedShort));
            return;
        }
        int i2 = u67Var.readInt();
        if (i2 < 8) {
            xh6.c(grc.p(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            u67Var.c(i3);
        }
    }

    public final void r() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                r67 r67Var = (r67) entry.getValue();
                r67Var.toString();
                r67Var.f(this.f);
            }
            i++;
        }
    }

    public final void t(byte[] bArr, int i) throws IOException {
        u67 u67Var = new u67(bArr);
        q(u67Var);
        u(u67Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.u67 r27, int r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v67.u(u67, int):void");
    }

    public final void v(String str, int i, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (r67) map.get(str));
        mapArr[i].remove(str);
    }

    public final void w(q67 q67Var) throws Throwable {
        r67 r67Var;
        HashMap map = this.d[4];
        r67 r67Var2 = (r67) map.get("Compression");
        if (r67Var2 == null) {
            o(q67Var, map);
            return;
        }
        int iE = r67Var2.e(this.f);
        if (iE != 1) {
            if (iE == 6) {
                o(q67Var, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        r67 r67Var3 = (r67) map.get("BitsPerSample");
        if (r67Var3 != null) {
            int[] iArr = (int[]) r67Var3.g(this.f);
            int[] iArr2 = n;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.c != 3 || (r67Var = (r67) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iE2 = r67Var.e(this.f);
                if ((iE2 != 1 || !Arrays.equals(iArr, o)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            r67 r67Var4 = (r67) map.get("StripOffsets");
            r67 r67Var5 = (r67) map.get("StripByteCounts");
            if (r67Var4 == null || r67Var5 == null) {
                return;
            }
            long[] jArrB = ljk.b(r67Var4.g(this.f));
            long[] jArrB2 = ljk.b(r67Var5.g(this.f));
            if (jArrB == null || jArrB.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrB2 == null || jArrB2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrB.length != jArrB2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j = 0;
            for (long j2 : jArrB2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.g = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrB.length; i3++) {
                int i4 = (int) jArrB[i3];
                int i5 = (int) jArrB2[i3];
                if (i3 < jArrB.length - 1 && i4 + i5 != jArrB[i3 + 1]) {
                    this.g = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                try {
                    q67Var.c(i6);
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    q67Var.readFully(bArr2);
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.g) {
                long j3 = jArrB[0];
            }
        }
    }

    public final void x(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        r67 r67Var = (r67) mapArr[i].get("ImageLength");
        r67 r67Var2 = (r67) mapArr[i].get("ImageWidth");
        r67 r67Var3 = (r67) mapArr[i2].get("ImageLength");
        r67 r67Var4 = (r67) mapArr[i2].get("ImageWidth");
        if (r67Var == null || r67Var2 == null || r67Var3 == null || r67Var4 == null) {
            return;
        }
        int iE = r67Var.e(this.f);
        int iE2 = r67Var2.e(this.f);
        int iE3 = r67Var3.e(this.f);
        int iE4 = r67Var4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void y(u67 u67Var, int i) throws Throwable {
        r67 r67VarC;
        r67 r67VarC2;
        HashMap[] mapArr = this.d;
        r67 r67Var = (r67) mapArr[i].get("DefaultCropSize");
        r67 r67Var2 = (r67) mapArr[i].get("SensorTopBorder");
        r67 r67Var3 = (r67) mapArr[i].get("SensorLeftBorder");
        r67 r67Var4 = (r67) mapArr[i].get("SensorBottomBorder");
        r67 r67Var5 = (r67) mapArr[i].get("SensorRightBorder");
        if (r67Var != null) {
            int i2 = r67Var.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                t67[] t67VarArr = (t67[]) r67Var.g(byteOrder);
                if (t67VarArr == null || t67VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(t67VarArr));
                    return;
                }
                r67VarC = r67.b(t67VarArr[0], this.f);
                r67VarC2 = r67.b(t67VarArr[1], this.f);
            } else {
                int[] iArr = (int[]) r67Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                r67VarC = r67.c(iArr[0], this.f);
                r67VarC2 = r67.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", r67VarC);
            mapArr[i].put("ImageLength", r67VarC2);
            return;
        }
        if (r67Var2 != null && r67Var3 != null && r67Var4 != null && r67Var5 != null) {
            int iE = r67Var2.e(this.f);
            int iE2 = r67Var4.e(this.f);
            int iE3 = r67Var5.e(this.f);
            int iE4 = r67Var3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            r67 r67VarC3 = r67.c(iE2 - iE, this.f);
            r67 r67VarC4 = r67.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", r67VarC3);
            mapArr[i].put("ImageWidth", r67VarC4);
            return;
        }
        r67 r67Var6 = (r67) mapArr[i].get("ImageLength");
        r67 r67Var7 = (r67) mapArr[i].get("ImageWidth");
        if (r67Var6 == null || r67Var7 == null) {
            r67 r67Var8 = (r67) mapArr[i].get("JPEGInterchangeFormat");
            r67 r67Var9 = (r67) mapArr[i].get("JPEGInterchangeFormatLength");
            if (r67Var8 == null || r67Var9 == null) {
                return;
            }
            int iE5 = r67Var8.e(this.f);
            int iE6 = r67Var8.e(this.f);
            u67Var.d(iE5);
            byte[] bArr = new byte[iE6];
            u67Var.readFully(bArr);
            f(new q67(bArr), iE5, i);
        }
    }

    public final void z() throws Throwable {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] mapArr = this.d;
        r67 r67Var = (r67) mapArr[1].get("PixelXDimension");
        r67 r67Var2 = (r67) mapArr[1].get("PixelYDimension");
        if (r67Var != null && r67Var2 != null) {
            mapArr[0].put("ImageWidth", r67Var);
            mapArr[0].put("ImageLength", r67Var2);
        }
        if (mapArr[4].isEmpty() && p(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        p(mapArr[4]);
        v("ThumbnailOrientation", 0, "Orientation");
        v("ThumbnailImageLength", 0, "ImageLength");
        v("ThumbnailImageWidth", 0, "ImageWidth");
        v("ThumbnailOrientation", 5, "Orientation");
        v("ThumbnailImageLength", 5, "ImageLength");
        v("ThumbnailImageWidth", 5, "ImageWidth");
        v("Orientation", 4, "ThumbnailOrientation");
        v("ImageLength", 4, "ThumbnailImageLength");
        v("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
