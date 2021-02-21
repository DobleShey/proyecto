package com.example.umpa;

import android.provider.BaseColumns;

public class Userscontrat {

    public static abstract class UsersEntry implements BaseColumns {
        public static final String TABLE_NAME="usuario";

        public static final String ID="id";
        public static final String NAME="nombre";
        public static final String PASSWORD="contraseña";
        public static final String EMAIL="email";
    }
}
