package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum lmk implements erj {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_INPUT(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIAPIPE_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(101),
    /* JADX INFO: Fake field, exist only in values array */
    NO_NETWORK_CONNECTION(102),
    /* JADX INFO: Fake field, exist only in values array */
    METERED_NETWORK(103),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILED(104),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(105),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(106),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(107),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(108),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(109),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(110),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(111),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(112),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(113),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(114),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(115),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(116),
    OPTIONAL_MODULE_NOT_AVAILABLE(201),
    OPTIONAL_MODULE_INIT_ERROR(202),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(203),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(204),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(205),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(206),
    OPTIONAL_MODULE_CREATE_ERROR(207),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERAX_SOURCE_ERROR(301),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_CANT_START_ERROR(302),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR(303),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR(304),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR(305),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_UNAVAILABLE(400),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CANCELLED(401),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED(402),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_APP_NAME_UNAVAILABLE(403),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_TASK_IN_PROGRESS(404),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR(405),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INFERENCE_ERROR(406),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(407),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR(9999);

    public final int E;

    lmk(int i) {
        this.E = i;
    }

    @Override // defpackage.erj
    public final int zza() {
        return this.E;
    }
}
