package it.zygotecode.grandanticheat.utils.hitbox;

import org.bukkit.entity.Entity;

import it.zygotecode.grandanticheat.utils.BlockPosition;

public class MovingObjectPosition {
   private BlockPosition e;
   public EnumMovingObjectType type;
   public EnumDirection direction;
   public Vec3D pos;
   public Entity entity;

   public MovingObjectPosition(Vec3D vec3d, EnumDirection enumdirection, BlockPosition blockposition) {
      this(EnumMovingObjectType.BLOCK, vec3d, enumdirection, blockposition);
   }

   public MovingObjectPosition(Vec3D vec3d, EnumDirection enumdirection) {
      this(EnumMovingObjectType.BLOCK, vec3d, enumdirection, BlockPosition.ZERO);
   }

   public MovingObjectPosition(Entity entity) {
      this(entity, new Vec3D(entity.getLocation().getX(), entity.getLocation().getY(), entity.getLocation().getZ()));
   }

   public MovingObjectPosition(EnumMovingObjectType movingobjectposition_enummovingobjecttype, Vec3D vec3d, EnumDirection enumdirection, BlockPosition blockposition) {
      this.type = movingobjectposition_enummovingobjecttype;
      this.e = blockposition;
      this.direction = enumdirection;
      this.pos = new Vec3D(vec3d.a, vec3d.b, vec3d.c);
   }

   public MovingObjectPosition(Entity entity, Vec3D vec3d) {
      this.type = EnumMovingObjectType.ENTITY;
      this.entity = entity;
      this.pos = vec3d;
   }

   public BlockPosition a() {
      return this.e;
   }

   public String toString() {
      return "HitResult{type=" + this.type + ", blockpos=" + this.e + ", f=" + this.direction + ", pos=" + this.pos + ", entity=" + this.entity + '}';
   }
}
